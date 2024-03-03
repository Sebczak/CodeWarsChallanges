package com.codewars.tier6;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            char lowerCaseChar = Character.toLowerCase(c);
            charFrequencyMap.put(lowerCaseChar, charFrequencyMap.getOrDefault(lowerCaseChar, 0) + 1);
        }

        int count = 0;
        for (int frequency : charFrequencyMap.values()) {
            if (frequency > 1) {
                count++;
            }
        }

        return count;
    }
}