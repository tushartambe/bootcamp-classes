package com.bootcamp.builderpattern;

import java.util.List;

class Pizza {
    private final Price BASE_PRICE;
    private Toppings toppings;

    Pizza() {
        this(50);
    }

    Pizza(Integer base_price) {
        this.BASE_PRICE = new Price(base_price);
        this.toppings = new Toppings();
    }

    Price getPrice() {
        return this.BASE_PRICE.add(this.toppings.getTotalPrice());
    }

    void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    List<String> getDescription() {
        Description description = new Description(this.toppings.getToppings(), this.getPrice());
        description.print();
        return description.getDescription();
    }
}
