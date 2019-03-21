package com.bootcamp.units;

import java.math.BigDecimal;

public class Quantity {
    private BigDecimal value;
    private Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object newQuantity) {
        if (!(newQuantity instanceof Quantity)) return false;

        Quantity anotherQuantity = (Quantity) newQuantity;
        if (!(this.unit.isOfSameType(((Quantity) newQuantity).unit))) return false;

        BigDecimal firstQuantityBaseValue = this.unit.convertToBaseUnitValue(this.value);
        BigDecimal secondQuantityBaseValue = anotherQuantity.unit.convertToBaseUnitValue(anotherQuantity.value);

        return firstQuantityBaseValue.equals(secondQuantityBaseValue);
    }
}