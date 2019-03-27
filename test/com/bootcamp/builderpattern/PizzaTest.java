package com.bootcamp.builderpattern;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void shouldGetTheTotalPriceAs50Initially() {
        Pizza pizza = new Pizza();
        assertEquals(new Price(50), pizza.getPrice());
    }

    @Test
    void shouldIncreasePriceAfterAddingTopping() {
        Pizza pizza = new Pizza();
        pizza.addTopping(Topping.TOMATO_SAUCE);
        pizza.addTopping(Topping.TOMATO_SAUCE);
        assertEquals(new Price(60),pizza.getPrice());
    }

    @Test
    void shouldSetBasePriceAsProvided() {
        Pizza pizza = new Pizza(60);
        pizza.addTopping(Topping.TOMATO_SAUCE);
        pizza.addTopping(Topping.TOMATO_SAUCE);
        assertEquals(new Price(70),pizza.getPrice());
    }

    @Test
    void shouldReturnPizzaDescription() {
        Pizza pizza = new Pizza();
        pizza.addTopping(Topping.VEGITABLE);
        pizza.addTopping(Topping.EXTRA_CHEESE);
        pizza.addTopping(Topping.CHICKEN);

        List<String> expected = new ArrayList<>();
        expected.add(Topping.VEGITABLE.name());
        expected.add(Topping.EXTRA_CHEESE.name());
        expected.add(Topping.CHICKEN.name());
        expected.add("TOTAL:125");

        assertEquals(expected,pizza.getDescription());
    }
    
    
}