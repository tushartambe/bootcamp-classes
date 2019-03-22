package com.bootcamp.units;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldReturnTrueIfBothTheQuantiesAreEqual() {
        Quantity feet = new Quantity(new BigDecimal(1), RatioUnit.FEET);
        Quantity inch = new Quantity(new BigDecimal(12), RatioUnit.INCH);
        assertEquals(feet, inch);

    }

    @Test
    void shouldReturnFalseIfBotheQuantityAreNotEqual() {
        Quantity feet = new Quantity(new BigDecimal(1), RatioUnit.FEET);
        Quantity inch = new Quantity(new BigDecimal(1), RatioUnit.INCH);
        assertNotEquals(feet, inch);
    }

    @Test
    void shouldReturnTrueIfTwoInchAndFiveCentimetrAreEqual() {
        Quantity inch1 = new Quantity(new BigDecimal(2), RatioUnit.INCH);
        Quantity cms = new Quantity(new BigDecimal(5), RatioUnit.CENTIMETER);
        assertEquals(inch1, cms);
    }

    @Test
    void shouldReturnTrueIfOneCMIsEqualToTENMM() {
        Quantity centimeter = new Quantity(new BigDecimal(1), RatioUnit.CENTIMETER);
        Quantity milimeter = new Quantity(new BigDecimal(10), RatioUnit.MILLIMETER);
        assertEquals(centimeter, milimeter);
    }

    @Test
    @DisplayName("3.78 litre should equal to 1 gallon")
    void shouldReturnTrue() {
        Quantity litre = new Quantity(new BigDecimal(3), RatioUnit.LITRE);
        Quantity gallon = new Quantity(new BigDecimal(1), RatioUnit.GALLON);

        assertEquals(litre, gallon);
    }

    @Test
    @DisplayName("3.78 litre should not equal to 2 gallon")
    void shouldReturnFalse() {
        Quantity litre = new Quantity(new BigDecimal(3), RatioUnit.LITRE);
        Quantity gallon = new Quantity(new BigDecimal(2), RatioUnit.GALLON);

        assertNotEquals(litre, gallon);
    }


    @Test
    @DisplayName("should not compare units of different type")
    void test1() {
        Quantity litre = new Quantity(new BigDecimal(1), RatioUnit.LITRE);
        Quantity inch = new Quantity(new BigDecimal(1), RatioUnit.INCH);

        assertNotEquals(litre, inch);
    }

    @Test
    @DisplayName("should add two quantities of same type of unit")
    void test2() throws DifferentUnitsAdditionException {
        Quantity inch1 = new Quantity(new BigDecimal(2), RatioUnit.INCH);
        Quantity inch2 = new Quantity(new BigDecimal(2), RatioUnit.INCH);

        Quantity expected = new Quantity(new BigDecimal(4), RatioUnit.INCH);
        Quantity actual = inch1.add(inch2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should not add two quantities of different type of unit")
    void test3() {
        Quantity inch1 = new Quantity(new BigDecimal(2), RatioUnit.INCH);
        Quantity inch2 = new Quantity(new BigDecimal(2), RatioUnit.LITRE);
        assertThrows(DifferentUnitsAdditionException.class, () -> inch1.add(inch2));
    }


    @Test
    @DisplayName("should add two quantities of different type of unit of length")
    void test4() throws DifferentUnitsAdditionException {
        Quantity inch1 = new Quantity(new BigDecimal(2), RatioUnit.INCH);
        Quantity cms = new Quantity(new BigDecimal(5), RatioUnit.CENTIMETER);

        Quantity expected = new Quantity(new BigDecimal(4), RatioUnit.INCH);
        Quantity actual = inch1.add(cms);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should add one gallon and one litre")
    void test5() throws DifferentUnitsAdditionException {
        Quantity litres = new Quantity(new BigDecimal(2), RatioUnit.LITRE);
        Quantity gallons = new Quantity(new BigDecimal(2), RatioUnit.GALLON);

        Quantity expected = new Quantity(new BigDecimal(8), RatioUnit.LITRE);
        Quantity actual = litres.add(gallons);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should compare 212 farhenit and 100 celsius")
    void test6() {
        Quantity ft = new Quantity(new BigDecimal(212), ScaleUnit.FAHRENHEIT);
        Quantity celsius = new Quantity(new BigDecimal(100), ScaleUnit.CELSIUS);
        assertEquals(ft, celsius);
    }
}