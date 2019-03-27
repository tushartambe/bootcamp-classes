package com.bootcamp.builderpattern;

import java.util.Objects;

class Price {
    private Integer value;

    Price(Integer value)  {
        validatePriceValue(value);
        this.value = value;
    }

    private static void validatePriceValue(Integer value) throws RuntimeException {
        if (value < 0) {
            throw new RuntimeException("Invalid price value");
        }
    }

    Integer getPriceValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(value, price.value);
    }

    Price add(Price price) {
       return new Price(this.value += price.value);
    }
}
