package com.codewars;

import com.codewars.tier4.TimeFormatter;
import com.codewars.tier5.SimplePigLatin;
import com.codewars.tier7.Testing123;
import com.codewars.tier8.BetterThanAvg;
import com.codewars.tier8.ReverseNumber;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        System.out.println(SimplePigLatin.pigIt("Pig latin is cool"));
        System.out.println(TimeFormatter.formatDuration(3660));
        System.out.println(Testing123.number(List.of("a", "b","c")));
        System.out.println(Arrays.toString(ReverseNumber.digitize(321)));
        System.out.println(BetterThanAvg.betterThanAverage(new int[]{2, 3},5));
    }
}