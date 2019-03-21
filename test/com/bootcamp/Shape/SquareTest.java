package com.bootcamp.Shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;
    Dimension side;

    @BeforeEach
    void setUp() throws Exception {
        side = new Dimension(10D);
        square = new Square(side);

    }

    @Test
    void calculateArea() {
        assertEquals(square.calculateArea(),100);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(square.calculatePerimeter(),40);
    }
}