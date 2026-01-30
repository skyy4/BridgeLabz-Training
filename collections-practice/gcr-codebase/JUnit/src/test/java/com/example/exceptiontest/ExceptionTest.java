package com.example.exceptiontest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.calculator.Calculator;

public class ExceptionTest {

    @Test
    void testArithmeticException() {
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
    }
}
