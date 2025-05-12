package com.gmail.ponomarenko.homeworks.homework06;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();
        // forMethod(numberOfRows);
        whileMethod(numberOfRows);
    }

    public static void forMethod(int numberOfRows) {
        int sum = 0;
        if (numberOfRows > 0) {
            for (int i = 1; i <= numberOfRows; i++) {
                sum += i;
                System.out.printf("%d) Num is %d, sum is %d \n", i, i, sum);
            }
            System.out.println("------------------------");
            System.out.printf("Sum of numbers is %d", sum);
        } else {
            System.out.printf("Sum of numbers is %d", sum);
        }
    }

    public static void whileMethod(int numberOfRows) {
        int step = 1;
        int sum = 0;
        if (numberOfRows > 0) {
            while (step <= numberOfRows) {
                sum += step;
                System.out.printf("%d) Num is %d, sum is %d \n", step, step, sum);
                step++;
            }
            System.out.println("------------------------");
            System.out.printf("Sum of numbers is %d", sum);
        } else {
            System.out.printf("Sum of numbers is %d", sum);
        }
    }
}


