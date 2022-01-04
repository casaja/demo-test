package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeUnitTest {

    @Test
    void shouldWelcome() {
        WelcomeController welcomeController = new WelcomeController();
        assertEquals("Welcome", welcomeController.welcome());
    }
}