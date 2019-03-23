package com.bootcamp.pizzashop;

public enum Topping {
    VEGITABLE(new Price(20)),
    CHICKEN(new Price(30)),
    MOZZARELLA(new Price(10)),
    EXTRA_CHEESE(new Price(25)),
    JALAPENO(new Price(40)),
    TOMATO_SAUCE(new Price(5));
    private Price price;

    Topping(Price price){
        this.price = price;
    }

    Price getPrice() {
        return this.price;
    }
}
