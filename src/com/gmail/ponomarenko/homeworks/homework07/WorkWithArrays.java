package com.gmail.ponomarenko.homeworks.homework07;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkWithArrays {
    public static void main(String[] args) {
        int size = getSize();
        int[] array = createRandomArray(size);
        System.out.println("Elements of the array: " + Arrays.toString(array));

        int negativeSum = negativeSum(array);
        System.out.println("Sum of negative numbers: " + negativeSum);

        evenOddCounts(array);
        maxMin(array);
        averageAfterFirstNegative(array);
    }

    private static int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        int size;
        do {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Please enter a number greater than zero.");
            }
        } while (size <= 0);
        return size;
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }
        return array;
    }

    public static int negativeSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            if (j < 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static void evenOddCounts(int[] array) {
        int evenCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + (array.length - evenCount));
    }

    public static void maxMin(int[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            } else if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        System.out.printf("Largest element: %d (with index %d) \n", array[maxIndex], maxIndex);
        System.out.printf("Smallest element: %d (with index %d) \n", array[minIndex], minIndex);
    }

    public static void averageAfterFirstNegative(int[] array) {
        int index = 0;
        while (index < array.length && array[index] >= 0) {
            index++;
        }
        if (index < array.length - 1) {
            double sum = 0;
            for (int i = index + 1; i < array.length; i++) {
                sum += array[i];
            }
            double average = sum / (array.length - index - 1);
            System.out.println("The average of the numbers after the first negative number: " + average);
        } else if (index == array.length - 1) {
            System.out.println("No numbers after the first negative.");
        } else {
            System.out.println("No negative numbers were found.");
        }
    }
}