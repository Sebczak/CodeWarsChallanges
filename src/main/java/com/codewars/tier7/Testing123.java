package com.codewars.tier7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Testing123 {
    public static List<String> number(List<String> lines) {
        ArrayList<String> result = new ArrayList<>();
        int intResult = 0;
        String stringResult = "";
        for (String s : lines) {
            intResult++;
            stringResult = intResult + ": " + s;
            result.add(stringResult);
        }
        return result;
    }
}
