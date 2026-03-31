package com.example.stringutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils u = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("avaj", u.reverse("java"));
    }

    @Test
    void testPalindrome() {
        assertTrue(u.isPalindrome("madam"));
    }

    @Test
    void testUpperCase() {
        assertEquals("HELLO", u.toUpperCase("hello"));
    }
}
