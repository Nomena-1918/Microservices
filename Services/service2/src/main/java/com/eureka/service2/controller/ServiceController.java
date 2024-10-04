package com.eureka.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class ServiceController {

    @GetMapping
    public String service2() {
        return "Service 2 is running";
    }
}
