package com.aweiz.dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    MyService service;

    @GetMapping("/hi")
    public String home() {
        System.out.println(service.getSomething());
        return "I got: " + UserContext.getUserContext().getUserHeader();
    }

}
