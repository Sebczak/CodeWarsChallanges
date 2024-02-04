package com.codewars.tier5;

public class SimplePigLatin {
    public static String pigIt(String str) {

        String[] arr = str.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : arr) {
            if (s.matches("[a-zA-Z]+")) {
                String result = s.substring(1) + s.charAt(0) + "ay";
                stringBuilder.append(result).append(" ");
            } else {
                stringBuilder.append(s).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
