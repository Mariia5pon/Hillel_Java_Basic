package com.gmail.ponomarenko.homeworks.homework09;

import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int rows = readInt("rows");
        int columns = readInt("columns");
    }

    public static int readInt(String string) {
        System.out.printf("Enter the number of %s: ", string);
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Please enter a number greater than zero.");
            }
        } while (size <= 0);
        return size;
    }
}
