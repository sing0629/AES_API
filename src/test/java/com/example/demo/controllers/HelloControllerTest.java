package com.example.demo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void encrypt() {
        HelloController controller = new HelloController(); // Arrange
        String response = controller.encrypt("Apple","404D635166546A576E5A723475377721"); // Act
        assertEquals("McTKAkMng9x9NdOlR8z6Mg==", response);// Assert
    }
    @Test
    void decrypt() {
        HelloController controller = new HelloController(); // Arrange
        String response = controller.decrypt("McTKAkMng9x9NdOlR8z6Mg==","404D635166546A576E5A723475377721"); // Act
        assertEquals("Apple", response);// Assert
    }
}