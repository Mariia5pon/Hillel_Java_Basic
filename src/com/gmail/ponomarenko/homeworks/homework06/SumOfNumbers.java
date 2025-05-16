package com.gmail.ponomarenko.homeworks.homework06;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();
        forMethod(numberOfRows);
        whileMethod(numberOfRows);
        doWhileMethod(numberOfRows);
    }

    public static void forMethod(int numberOfRows) {
        System.out.println("--= FOR LOOP =--");
        int sum = 0;
        for (int i = 1; i <= numberOfRows; i++) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d \n", i, i, sum);
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d \n", sum);
    }

    public static void whileMethod(int numberOfRows) {
        System.out.println("--= WHILE LOOP =--");
        int step = 1;
        int sum = 0;
        while (step <= numberOfRows) {
            sum += step;
            System.out.printf("%d) Num is %d, sum is %d \n", step, step, sum);
            step++;
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d \n", sum);
    }

    public static void doWhileMethod(int numberOfRows) {
        System.out.println("--= DO-WHILE LOOP =--");
        int step = 1;
        int sum = 0;
        if (numberOfRows > 0) {
            do {
                sum += step;
                System.out.printf("%d) Num is %d, sum is %d \n", step, step, sum);
                step++;
            } while (step <= numberOfRows);
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d", sum);
    }
}


