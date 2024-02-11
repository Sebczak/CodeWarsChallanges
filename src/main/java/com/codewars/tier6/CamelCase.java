package com.codewars.tier6;

import java.util.Arrays;

public class CamelCase {
    public static String toCamelCase(String s){
        String[] arr = s.split("[-_]");
        String output = "";

        for (int i = 0;i<arr.length;i++) {
             if (i == 0){
                output += arr[i];
            } else {
                 output += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            }
        }
        return output;
    }
}
