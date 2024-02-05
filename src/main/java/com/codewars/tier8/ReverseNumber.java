package com.codewars.tier8;

import java.util.Arrays;

public class ReverseNumber {
    public static int[] digitize(long n) {
        String input = new StringBuilder(String.valueOf(n)).reverse().toString();

        System.out.println(input);
        int[] arr = new int[input.length()];

        for (int i = 0; i<input.length();i++) {
            arr[i] = Character.getNumericValue(input.charAt(i));
        }
        return arr;
    }
}
