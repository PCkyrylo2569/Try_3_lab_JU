package com.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    @Override
    protected void setUp() {
        calculator = new Calculator();
    }

    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    public void testDivideByZero() {
        try {
            calculator.divide(5, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}