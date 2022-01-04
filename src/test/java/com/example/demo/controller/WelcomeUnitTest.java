package com.example.demo.controller;

import com.example.demo.service.WelcomeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WelcomeUnitTest {

    @Test
    void shouldWelcome() {

        WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
        when(welcomeService.getWelcomeMessage("Javi")).thenReturn("Welcome Javi!");
        WelcomeController welcomeController = new WelcomeController(welcomeService);
        assertEquals("Welcome Javi!", welcomeController.welcome("Javi"));
    }
}