package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.calculate(Calculator.Operation.ADD, 2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.calculate(Calculator.Operation.SUBTRACT, 5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.calculate(Calculator.Operation.MULTIPLY, 2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.calculate(Calculator.Operation.DIVIDE, 6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.calculate(Calculator.Operation.DIVIDE, 5, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testUnsupportedOperation() {
        calculator.calculate(Calculator.Operation.UNKNOWN_OPERATION, 2, 3); // Pass a valid Operation enum value
    }




}
