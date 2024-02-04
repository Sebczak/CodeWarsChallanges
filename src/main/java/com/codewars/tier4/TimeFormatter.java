package com.codewars.tier4;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int years = seconds / (365 * 24 * 3600);
        int days = (seconds % (365 * 24 * 3600)) / (24 * 3600);
        int hours = (seconds % (24 * 3600)) / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        StringBuilder result = new StringBuilder();

        if (years > 0) {
            result.append(years).append(years > 1 ? " years" : " year").append(", ");
        }

        if (days > 0) {
            result.append(days).append(days > 1 ? " days" : " day").append(", ");
        }

        if (hours > 0) {
            result.append(hours).append(hours > 1 ? " hours" : " hour").append(", ");
        }

        if (minutes > 0) {
            result.append(minutes).append(minutes > 1 ? " minutes" : " minute").append(", ");
        }

        if (remainingSeconds > 0) {
            if (result.length() > 0) {
                if (years == 0 && days == 0 && hours == 0 && minutes == 0) {
                    result.append("and ");
                } else {
                    result.append(", and ");
                }
            }
            result.append(remainingSeconds).append(remainingSeconds > 1 ? " seconds" : " second");
        }

        return result.toString().trim();
    }
}
