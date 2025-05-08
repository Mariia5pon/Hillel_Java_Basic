package com.gmail.ponomarenko.lectures;

public class Lecture07 {
    public static void main(String[] args) {
        /* ---= TOO BAD =---
        int temp = 16;
        int yesterdayTemp = 12;
        int dayBeforeYesterdayTemperature = 10;

        int size = 3;

        int average = (temp + yesterdayTemp + dayBeforeYesterdayTemperature) / size;

        System.out.println("Average temperature == " + average);
         */

        int[] temperatures = new int[3];
        temperatures[0] = 3;
        temperatures[1] = 12;
        temperatures[2] = 10;

        int average = (temperatures[0] + temperatures[1] + temperatures[2] / temperatures.length);

        System.out.println("Average temperature ==" + average);
    }
}
