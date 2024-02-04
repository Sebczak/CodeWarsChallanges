package com.codewars;

import com.codewars.tier4.TimeFormatter;
import com.codewars.tier5.SimplePigLatin;
import com.codewars.tier7.Testing123;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        System.out.println(SimplePigLatin.pigIt("Pig latin is cool"));
        System.out.println(TimeFormatter.formatDuration(3660));
        System.out.println(Testing123.number(List.of("a", "b","c")));
    }
}