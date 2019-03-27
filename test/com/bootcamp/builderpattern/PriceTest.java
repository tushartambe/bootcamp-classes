package com.bootcamp.builderpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {
    @Test
    void shouldThrowExceptionForCreatingNegativePrice() {
        assertThrows(Exception.class, () -> new Price(-10));
    }

    @Test
    void shouldNotThrowExceptionForCreatingValidPrice() {
        assertDoesNotThrow(() -> new Price(10));
    }
}