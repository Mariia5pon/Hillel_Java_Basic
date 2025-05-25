package com.gmail.ponomarenko.homeworks.homework10;

import java.util.Scanner;

public class WorkingWithMethods {
    public static void main(String[] args) {
        int number = readInt();
    }

    public static int readInt() {
        System.out.println("Enter an integer number.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
