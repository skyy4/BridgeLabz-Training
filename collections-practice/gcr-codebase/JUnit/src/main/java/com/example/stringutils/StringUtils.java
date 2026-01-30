package com.example.stringutils;

public class StringUtils {

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    public String toUpperCase(String s) {
        return s.toUpperCase();
    }
}
