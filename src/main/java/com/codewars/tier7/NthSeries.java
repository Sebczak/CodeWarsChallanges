package com.codewars.tier7;

import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
        double sum = 0;
        for(int i = 0; i<n; i++) {
            sum += 1.0 / (1 + i * 3);
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(sum);
    }
}
