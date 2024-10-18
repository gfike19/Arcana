package com.example.Arcana.controllers;
// Import necessary modules
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
@Controller
public class ErrorControllerDev implements ErrorController {

    private static final String ERROR_PATH = "/error";

    // Handle generic exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGenericException(Exception ex, WebRequest request) {
        ex.printStackTrace(); // Log the error details to the console for debugging

        // Create an error response with details
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "error",
                ex.getMessage(),
                ex.getStackTrace().toString()
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Handle /error route
    @RequestMapping(ERROR_PATH)
    public ResponseEntity<Object> handleError() {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                "error",
                "The requested resource was not found.",
                "No stack trace available"
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    // Removed @Override annotation as it does not override any method from a supertype
    public String getErrorPath() {
        return ERROR_PATH;
    }

    // Error response class to encapsulate error details
    public static class ErrorResponse {
        private int statusCode;
        private String status;
        private String message;
        private String stack;

        public ErrorResponse(int statusCode, String status, String message, String stack) {
            this.statusCode = statusCode;
            this.status = status;
            this.message = message;
            this.stack = stack;
        }

        // Getters and setters
        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStack() {
            return stack;
        }

        public void setStack(String stack) {
            this.stack = stack;
        }
    }
}

// Usage Example in a Spring Boot Application
// Add @ControllerAdvice to automatically handle exceptions globally in the Spring Boot application.
