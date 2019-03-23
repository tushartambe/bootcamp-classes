package com.bootcamp.pizzashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToppingsTest {
    @Test
    void getTotalPrice() {
        Toppings toppings = new Toppings();
        toppings.add(Topping.CHICKEN);

        assertEquals(new Price(30),toppings.getTotalPrice());
    }

    @Test
    void getTotalPriceWhenAddTwoToppings() {
        Toppings toppings = new Toppings();
        toppings.add(Topping.CHICKEN);
        toppings.add(Topping.CHICKEN);

        assertEquals(new Price(60),toppings.getTotalPrice());
    }
}