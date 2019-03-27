package com.bootcamp.builderpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Description {
    private final Price price;
    private final List<Topping> toppings;
    private List<String> description;

    Description(List<Topping> toppings,Price price) {
        this.toppings = toppings;
        this.price = price;
        this.description = new ArrayList<>();
        this.createDescription();
    }

    private void createDescription() {
        for (Topping topping : toppings) {
            this.description.add(topping.name());
        }

        this.description.add("TOTAL:"+price.getPriceValue());
    }

    List<String> getDescription() {
        return Collections.unmodifiableList(this.description);
    }

    @Override
    public String toString() {
        return "Description{" +
                "description=" + description +
                '}';
    }

    void print() {
        System.out.println(this.description);
    }
}
