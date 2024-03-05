package com.codewars.tier8;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        int counter = 0;
        for (Object needle : haystack) {
            if ("needle".equals(needle)) {
                return "found the needle at position " + (counter);
            }
            counter++;
        }
        return "needle not found in the haystack";
    }
}
