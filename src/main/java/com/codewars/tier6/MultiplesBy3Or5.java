package com.codewars.tier6;

public class MultiplesBy3Or5 {

    public static int multiples(int number) {
        int result = 0;

        for (int i = 3; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
