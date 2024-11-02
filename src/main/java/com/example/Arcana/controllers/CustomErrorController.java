package com.example.Arcana.controllers;

import jakarta.servlet.http.*;
import org.springframework.boot.web.servlet.error.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public ResponseEntity<String> handleError(HttpServletRequest request) {
        Object status = request.getAttribute("javax.servlet.error.status_code");

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());
            HttpStatus httpStatus = HttpStatus.valueOf(statusCode);
            return new ResponseEntity<>("Error occurred: " + httpStatus.getReasonPhrase(), httpStatus);
        }

        return new ResponseEntity<>("Error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
    }

//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }
}

