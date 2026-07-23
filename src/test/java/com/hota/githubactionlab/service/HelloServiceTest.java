package com.hota.githubactionlab.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {

    @Test
    void shouldReturnHelloMessage() {

        // Arrange
        HelloService service = new HelloService();

        // Act
        String result = service.getMessage();

        // Assert
        assertEquals("Hello GitHub Actions clgt", result);
    }
}
