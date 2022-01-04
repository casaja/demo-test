package com.example.demo.service;

public class WelcomeService {

    public String getWelcomeMessage(String name) {
        return String.format("Welcome %s!", name);
    }
}
