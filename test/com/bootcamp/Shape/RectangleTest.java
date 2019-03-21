package com.bootcamp.Shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle;
    Dimension length;
    Dimension breadth;

    @BeforeEach
    void setUp() throws Exception {
        length = new Dimension(10D);
        breadth = new Dimension(5D);
        rectangle = new Rectangle(length,breadth);

    }

    @Test
    void calculateArea() {
        assertEquals(rectangle.calculateArea(),50);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(rectangle.calculatePerimeter(),30);
    }
}