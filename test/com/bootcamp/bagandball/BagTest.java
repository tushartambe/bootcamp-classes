package com.bootcamp.bagandball;

import com.bootcamp.compositedesignpattern.Image;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddAnyBallIntoBagAtFirst() {
        Bag bag = new Bag(12);
        Ball greenBall = new Ball(Color.GREEN);
        bag.add(greenBall);

        Map<Color, Integer> expected = new HashMap<>();
        expected.put(Color.GREEN, 1);
        Map actual = bag.getSummary();

        assertEquals(expected, actual);
    }
}