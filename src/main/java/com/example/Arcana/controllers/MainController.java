package com.example.Arcana.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String index() {
        return "This is the index";
    }
}
