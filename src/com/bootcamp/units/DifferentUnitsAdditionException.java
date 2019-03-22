package com.bootcamp.units;


class DifferentUnitsAdditionException extends Exception {
    DifferentUnitsAdditionException(String invalid_unit) {
        super(invalid_unit);
    }
}
