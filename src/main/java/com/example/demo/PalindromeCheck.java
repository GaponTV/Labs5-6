package com.example.demo;

public class PalindromeCheck {

    public static Boolean check(String text) {

        if(text.equals(new StringBuilder(text).reverse().toString())) {
            return true;
        }

        return false;
    }

}
