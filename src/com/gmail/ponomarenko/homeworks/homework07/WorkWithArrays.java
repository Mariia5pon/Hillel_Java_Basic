package com.gmail.ponomarenko.homeworks.homework07;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkWithArrays {
    public static void main(String[] args) {
        int size = getSize();
        int[] array = createRandomArray(size);
        System.out.println("Elements of the array: " + Arrays.toString(array));

        int negativeSum = getNegativeSum(array);
        System.out.println("Sum of negative numbers: " + negativeSum);

        int evenCount = getEvenCount(array);
        int oddCount = size - evenCount;
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);

        int maxIndex = getMaxIndex(array);
        int max = array[maxIndex];
        System.out.printf("Largest element: %d (with index %d) \n", max, maxIndex);

        int minIndex = getMinIndex(array);
        int min = array[minIndex];
        System.out.printf("Smallest element: %d (with index %d) \n", min, minIndex);

        int firstNegativeIndex = getFirstNegativeIndex(array);
        getAverageAfterFirstNegative(array, firstNegativeIndex);
    }

    private static int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        int size = 0;
        do {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Please enter a number greater than zero.");
            }
        } while (size <= 0);
        return size;
    }

    public static int[] createRandomArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
        return array;
    }

    public static int getNegativeSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int getEvenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int getMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int getMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getFirstNegativeIndex(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] < 0) {
                break;
            }
            i++;
        }
        return i;
    }

    public static void getAverageAfterFirstNegative(int[] array, int index) {
        if (index >= 0) {
            double sum = 0;
            int count = 0;
            for (int i = index + 1; i < array.length; i++) {
                sum += array[i];
                count++;
            }
            double average = sum / count;
            System.out.println("The average of the numbers after the first negative number: " + average);
        } else {
            System.out.println("No negative numbers were found.");
        }
    }
}