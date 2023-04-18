package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NextPageController {

    @GetMapping("/")
    String viewHome(){
        return "pages/index";

    }
}
