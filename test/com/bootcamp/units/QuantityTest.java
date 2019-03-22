package com.bootcamp.units;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void ShouldReturnTrueIfBotheQuantityAreEqual() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity inch = new Quantity(new BigDecimal(12), Unit.INCH);
        assertEquals(feet,inch);

    }

    @Test
    void ShouldReturnFalseIfBotheQuantityAreNotEqual() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity inch = new Quantity(new BigDecimal(1), Unit.INCH);
        assertNotEquals(feet,inch);
    }

    @Test
    void ShouldReturnTrueIfTwoInchAndFiveCentimetrAreEqual() {
        Quantity feet = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity inch = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertEquals(feet,inch);
    }

    @Test
    void ShouldReturnTrueIfOneCMIsEqualToTENMM() {
        Quantity centimeter = new Quantity(new BigDecimal(1), Unit.CENTIMETER);
        Quantity milimeter = new Quantity(new BigDecimal(10), Unit.MILLIMETER);
        assertEquals(centimeter,milimeter);
    }

    @Test
    @DisplayName("3.78 litre should equal to 1 gallon")
    void ShouldReturnTrue() {
        Quantity litre = new Quantity(new BigDecimal(3.78), Unit.LITRE);
        Quantity gallon = new Quantity(new BigDecimal(1), Unit.GALLON);

        assertEquals(litre, gallon);
    }

    @Test
    @DisplayName("3.78 litre should not equal to 2 gallon")
    void ShouldReturnFalse() {
        Quantity litre = new Quantity(new BigDecimal(3.78), Unit.LITRE);
        Quantity gallon = new Quantity(new BigDecimal(2), Unit.GALLON);

        assertNotEquals(litre, gallon);
    }


    @Test
    @DisplayName("Should not compare units of different type")
    void test1() {
        Quantity litre = new Quantity(new BigDecimal(1), Unit.LITRE);
        Quantity inch = new Quantity(new BigDecimal(1), Unit.INCH);

        assertNotEquals(litre, inch);
    }

    @Test
    @DisplayName("Should add two quantities of same type of unit")
    void test2() throws DifferentUnitsAdditionException{
        Quantity inch1 = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity inch2 = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity expected = new Quantity(new BigDecimal(4), Unit.INCH);
        Quantity actual = inch1.add(inch2);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Should not add two quantities of different type of unit")
    void test3() {
        Quantity inch1 = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity inch2 = new Quantity(new BigDecimal(2), Unit.LITRE);
        assertThrows(DifferentUnitsAdditionException.class,()-> inch1.add(inch2));
    }

}