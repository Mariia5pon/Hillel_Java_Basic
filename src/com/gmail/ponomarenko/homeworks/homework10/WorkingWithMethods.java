package com.gmail.ponomarenko.homeworks.homework10;

import java.util.Scanner;

public class WorkingWithMethods {
    public static void main(String[] args) {
        int number = readInt("1. Enter an integer number: ");
        System.out.printf("\tThe square of %d is %d.", number, square(number));
    }

    public static int readInt(String string) {
        System.out.printf(string);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int square(int arg) {
        return arg * arg;
    }
}
