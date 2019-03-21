package com.bootcamp.units;

import java.math.BigDecimal;

class Unit {
    private BigDecimal ratio;
    private Object type;

    private static final Object LENGTH = new Object();
    private static final Object VOLUME = new Object();

    static final Unit FEET = new Unit(new BigDecimal(25 * 12),LENGTH);
    static final Unit INCH = new Unit(new BigDecimal(25),LENGTH);
    static final Unit CENTIMETER = new Unit(new BigDecimal(10),LENGTH);
    static final Unit MILLIMETER = new Unit(new BigDecimal(1),LENGTH);


    static final Unit GALLON = new Unit(new BigDecimal(3.78),VOLUME);
    static final Unit LITRE = new Unit(new BigDecimal(1),VOLUME);

    private Unit(BigDecimal ratio,Object type) {
        this.ratio = ratio;
        this.type = type;
    }

    BigDecimal convertToBaseUnitValue(BigDecimal value) {
        return this.ratio.multiply(value);
    }

    boolean isOfSameType(Unit anotherUnit){
        return this.type == anotherUnit.type;
    }
}
