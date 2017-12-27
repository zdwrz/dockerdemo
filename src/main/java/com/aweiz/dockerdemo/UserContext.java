package com.aweiz.dockerdemo;


public class UserContext {
    private static final UserContext userContext = new UserContext();
    private ThreadLocal<String> userHeader = new ThreadLocal<>();
    private UserContext() {}

    public static UserContext getUserContext() {
        return userContext;
    }

    public String getUserHeader() {
        return userHeader.get();
    }

    public void setUserHeader(String header) {
        userHeader.set(header);
    }
}
