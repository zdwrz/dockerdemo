package com.aweiz.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hi")
    public String home(@RequestHeader String myHeader) {
        UserContext.getUserContext().setUserHeader(myHeader);
        return "I got: " + UserContext.getUserContext().getUserHeader();
    }

}
