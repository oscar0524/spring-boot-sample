package com.example.springbootsample.webapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${my.test.property}")
    private String testProperty;

    @GetMapping("/hello")
    public String getMethodName() {
        return new String(appName + testProperty);
    }

}
