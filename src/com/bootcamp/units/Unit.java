package com.bootcamp.units;

import java.math.BigDecimal;

abstract class Unit {
    BigDecimal ratio;
    Object type;

    Unit(BigDecimal ratio, Object type) {
        this.ratio = ratio;
        this.type = type;
    }

    abstract BigDecimal convertToBaseUnitValue(BigDecimal value);
    abstract Unit getStandardUnit();
    abstract BigDecimal convertToStandardUnitValue(BigDecimal baseValue);

    boolean isOfSameType(Unit anotherUnit) {
        return this.type.equals(anotherUnit.type);
    }

}
