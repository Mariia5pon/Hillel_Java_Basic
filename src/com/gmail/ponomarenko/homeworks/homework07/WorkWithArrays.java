package com.gmail.ponomarenko.homeworks.homework07;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkWithArrays {
    public static void main(String[] args) {
        int numberOfIntegers = getNumberOfIntegers();
        int[] arrayOfIntegers = createRandomArray(numberOfIntegers);
        System.out.println("Elements of the array: " + Arrays.toString(arrayOfIntegers));

        int sumOfNegativeNumbers = getSumOfNegativeNumbers(arrayOfIntegers);
        System.out.println("Sum of negative numbers: " + sumOfNegativeNumbers);

        int countOfEvenNumbers = countTheNumberOfEvenNumbers(arrayOfIntegers);
        int countOfOddNumbers = numberOfIntegers - countOfEvenNumbers;
        System.out.println("Count of even numbers: " + countOfEvenNumbers);
        System.out.println("Count of odd numbers: " + countOfOddNumbers);

        int indexOfTheLargestElement = getTheIndexOfTheLargestElement(arrayOfIntegers);
        int largestElement = arrayOfIntegers[indexOfTheLargestElement];
        System.out.printf("Largest element: %d (with index %d) \n", largestElement, indexOfTheLargestElement);

        int indexOfTheSmallestElement = getTheIndexOfTheSmallestElement(arrayOfIntegers);
        int smallestElement = arrayOfIntegers[indexOfTheSmallestElement];
        System.out.printf("Smallest element: %d (with index %d) \n", smallestElement, indexOfTheSmallestElement);

        int indexOfFirstNegative = getIndexOfFirstNegative(arrayOfIntegers);
        getAverageAfterFirstNegative(arrayOfIntegers, indexOfFirstNegative);
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

    public static int[] createRandomArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
        return array;
    }

    public static int getSumOfNegativeNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int countTheNumberOfEvenNumbers(int[] array) {
        int countOfEvenNumbers = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNumbers++;
            }
        }
        return countOfEvenNumbers;
    }

    public static int getTheIndexOfTheLargestElement(int[] array) {
        int indexOfLargestElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfLargestElement]) {
                indexOfLargestElement = i;
            }
        }
        return indexOfLargestElement;
    }

    public static int getTheIndexOfTheSmallestElement(int[] array) {
        int indexOfSmallestElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexOfSmallestElement]) {
                indexOfSmallestElement = i;
            }
        }
        return indexOfSmallestElement;
    }

    public static int getIndexOfFirstNegative(int[] array) {
        int indexOfFirstNegative = -1;
        int i = 0;

        while (i < array.length) {
            if (array[i] < 0) {
                indexOfFirstNegative = i;
                break;
            }
            i++;
        }
        return indexOfFirstNegative;
    }

    public static void getAverageAfterFirstNegative(int[] array, int index) {
        double sum = 0;
        int count = 0;
        if (index >= 0) {
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