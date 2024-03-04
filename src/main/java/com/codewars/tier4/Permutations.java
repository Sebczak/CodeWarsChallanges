package com.codewars.tier4;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Permutations {

    public static List<String> singlePermutations(String s) {
        Set<String> result = new HashSet<>();
        generatePermutations("", s, result);
        return new ArrayList<>(result);
    }

    private static void generatePermutations(String prefix, String remaining, Set<String> result) {
        int length = remaining.length();
        if (length == 0) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < length; i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePermutations(newPrefix, newRemaining, result);
        }
    }
}