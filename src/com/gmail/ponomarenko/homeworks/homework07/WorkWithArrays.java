package com.gmail.ponomarenko.homeworks.homework07;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkWithArrays {
    public static void main(String[] args) {
        int numberOfIntegers = getNumberOfIntegers();
        random(numberOfIntegers);
    }

    private static int getNumberOfIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        int numberOfIntegers = 0;
        do {
            numberOfIntegers = scanner.nextInt();
            if (numberOfIntegers <= 0) {
                System.out.println("Please enter a number greater than zero.");
            }
        } while (numberOfIntegers <= 0);
        return numberOfIntegers;
    }

    public static void random(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
            System.out.println(array[i]);
        }
    }

    public static void sumOfNegativeNumbers() {

    }
}
