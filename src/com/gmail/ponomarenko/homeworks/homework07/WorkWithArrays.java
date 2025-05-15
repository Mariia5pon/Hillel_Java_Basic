package com.gmail.ponomarenko.homeworks.homework07;

import java.util.Scanner;

public class WorkWithArrays {
    public static void main(String[] args) {
        scanner();
    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        int numberOfIntegers = 0;
        do {
            numberOfIntegers = scanner.nextInt();
            if (numberOfIntegers <= 0) {
                System.out.println("Please enter a number greater than zero.");
            }
        } while (numberOfIntegers <= 0);
    }
}
