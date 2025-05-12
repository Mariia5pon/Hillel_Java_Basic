package com.gmail.ponomarenko.lectures.lecture07;

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

//        int[] temperatures = new int[5];
//        temperatures[0] = 3;
//        temperatures[1] = 12;
//        temperatures[2] = 10;
//        temperatures[3] = 13;
//        temperatures[4] = 15;

        int[] temperatures = {3, 12, 10, 13, 15};

        int[] previousTemperatures = new int[100];

        print(previousTemperatures); // [0, 0, 0, ... 0]
        print(temperatures);
        print(new int[]{1, 2, 3, 4});

        long sum = 0;
        for (int i=0; i < temperatures.length; i++){
            sum += temperatures[i];
        }

        //int average = (temperatures[0] + temperatures[1] + temperatures[2] / temperatures.length);
        int average = (int) (sum / temperatures.length);
        System.out.println("Average temperature == " + average);
    }

    public static void print(int[] temperatures) {
        System.out.print("Temperatures: [");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i] + ", ");
        }
        // ---= FOR EACH =---
        for ( int temperature: temperatures) {
            System.out.print(temperature + ", ");
        }
        System.out.print("]\n");
    }
}
