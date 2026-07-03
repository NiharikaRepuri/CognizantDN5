package com.cognizant.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(5, 4);
        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result);
    }
}