package com.bootcamp.builderpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Toppings {
    private List<Topping> toppings;
    private Price totalPrice;

    Toppings() {
        this.toppings = new ArrayList<>();
        this.totalPrice = new Price(0);
    }

    Price getTotalPrice() {
        return this.totalPrice;
    }

    void add(Topping topping) {
        this.toppings.add(topping);
        this.updatePrice(topping.getPrice());
    }

    private void updatePrice(Price price) {
        this.totalPrice = this.totalPrice.add(price);
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(this.toppings);
    }
}
