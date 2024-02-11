package com.codewars.tier6;

public class SpinWords {

    public static String spinWords(String sentence) {
        StringBuilder output = new StringBuilder();
        String[] arr = sentence.split("\\s");
        for (String s : arr) {
            if (s.length() >= 5) {
                output.append(new StringBuilder(s).reverse());
            } else {
                output.append(s);
            }
            output.append(" ");
        }
        return output.toString().trim();
    }
}
