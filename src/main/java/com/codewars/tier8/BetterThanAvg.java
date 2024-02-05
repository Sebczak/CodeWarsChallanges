package com.codewars.tier8;

public class BetterThanAvg {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double avg = 0;
        for (int s : classPoints) {
            avg += (double) s / classPoints.length;
        }
        return !(avg > yourPoints);
    }
}
