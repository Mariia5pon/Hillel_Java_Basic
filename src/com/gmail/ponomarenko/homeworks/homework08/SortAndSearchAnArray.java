package com.gmail.ponomarenko.homeworks.homework08;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortAndSearchAnArray {
    public static void main(String[] args) {
        int size = readInt();
        int[] array = createRandomArray(size);
        System.out.printf("Elements of the array: ");
        print(array);
        int[] sorted = insertionSort(array);
        System.out.printf("Sorted array: ");
        print(sorted);
    }

    private static int readInt() {
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
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        return array;
    }

    private static void print(int[] array) {
        System.out.print("[");
        if (array.length > 0) {
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            System.out.print(", " + element);
        }
        System.out.println("]");
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }
}
