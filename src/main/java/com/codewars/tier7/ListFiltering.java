package com.codewars.tier7;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(element -> element instanceof Integer)
                .collect(Collectors.toList());
    }
}
