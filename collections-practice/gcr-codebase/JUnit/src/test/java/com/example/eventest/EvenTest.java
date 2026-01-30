package com.example.eventest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenTest {

    boolean isEven(int n) {
        return n % 2 == 0;
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6, 7, 9 })
    void testEven(int n) {
        if (n % 2 == 0)
            assertTrue(isEven(n));
        else
            assertFalse(isEven(n));
    }
}
