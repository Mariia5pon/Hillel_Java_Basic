package com.gmail.ponomarenko.homeworks.homework06;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int numberOfRows = readInt();
        int sumFromFor = forMethod(numberOfRows);
        printResult(sumFromFor);
        int sumFromWhile = whileMethod(numberOfRows);
        printResult(sumFromWhile);
        int sumFromDoWhile = doWhileMethod(numberOfRows);
        printResult(sumFromDoWhile);
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        return scanner.nextInt();
    }

    public static int forMethod(int numberOfRows) {
        System.out.println("--= FOR LOOP =--");
        int sum = 0;
        for (int i = 1; i <= numberOfRows; i++) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d \n", i, i, sum);
        }
        return sum;
    }

    public static int whileMethod(int numberOfRows) {
        System.out.println("--= WHILE LOOP =--");
        int step = 1;
        int sum = 0;
        while (step <= numberOfRows) {
            sum += step;
            System.out.printf("%d) Num is %d, sum is %d \n", step, step, sum);
            step++;
        }
        return sum;
    }

    public static int doWhileMethod(int numberOfRows) {
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
        return sum;
    }

    public static void printResult(int result) {
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d \n", result);
    }
}


