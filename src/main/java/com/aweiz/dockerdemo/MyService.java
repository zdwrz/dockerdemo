package com.aweiz.dockerdemo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String getSomething(){
        return UserContext.getUserContext().getUserHeader();
    }
}
