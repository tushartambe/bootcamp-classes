package com.bootcamp.units;

import java.math.BigDecimal;

class ScaleUnit extends Unit {
    private BigDecimal scale;
    private static final Object TEMPERATURE = new Object();

    static final ScaleUnit FAHRENHEIT = new ScaleUnit(new BigDecimal(1), new BigDecimal(0), TEMPERATURE);
    static final ScaleUnit CELSIUS = new ScaleUnit(new BigDecimal(1.8), new BigDecimal(32), TEMPERATURE);

    private ScaleUnit(BigDecimal ratio, BigDecimal scale, Object type) {
        super(ratio,type);
        this.scale = scale;
    }

    @Override
    BigDecimal convertToBaseUnitValue(BigDecimal value) {
        return (this.ratio.multiply(value)).add(this.scale);
    }

    @Override
    Unit getStandardUnit() {
      return ScaleUnit.FAHRENHEIT;
    }

    @Override
    BigDecimal convertToStandardUnitValue(BigDecimal baseValue) {
        return baseValue.divide(getStandardUnit().ratio);
    }
}
