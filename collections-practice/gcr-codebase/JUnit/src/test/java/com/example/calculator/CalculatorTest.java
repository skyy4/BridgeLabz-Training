package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, c.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, c.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, c.multiply(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, c.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> c.divide(5, 0));
    }
}
