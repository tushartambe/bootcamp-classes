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
        if (!(this.unit.isOfSameType(anotherQuantity.unit))) return false;

        BigDecimal firstQuantityBaseValue = this.unit.convertToBaseUnitValue(this.value);
        BigDecimal secondQuantityBaseValue = anotherQuantity.unit.convertToBaseUnitValue(anotherQuantity.value);

        return firstQuantityBaseValue.intValue() == secondQuantityBaseValue.intValue();
    }

    Quantity add(Quantity anotherQuantity) throws DifferentUnitsAdditionException {
        if (!(this.unit.isOfSameType(anotherQuantity.unit))) {
            throw new DifferentUnitsAdditionException("Invalid unit");
        }

        BigDecimal firstQuantityBaseValue = this.unit.convertToBaseUnitValue(this.value);
        BigDecimal secondQuantityBaseValue = anotherQuantity.unit.convertToBaseUnitValue(anotherQuantity.value);

        BigDecimal additionOfBaseValues = firstQuantityBaseValue.add(secondQuantityBaseValue);
        return new Quantity(this.unit.convertToStandardUnitValue(additionOfBaseValues), this.unit.getStandardUnit());
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}