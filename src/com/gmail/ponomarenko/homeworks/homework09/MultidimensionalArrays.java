package com.gmail.ponomarenko.homeworks.homework09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int rows = readInt("rows");
        int columns = readInt("columns");
        int[][] matrix = randomMatrix(rows, columns);
        print(matrix);
        evenOddRowsSums(matrix);
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


    public static int[][] randomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 51);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void evenOddRowsSums(int[][] matrix) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < matrix[i].length; j++)
                    sumEven += matrix[i][j];
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    sumOdd += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of elements in even rows: " + sumEven);
        System.out.println("Sum of elements in odd rows: " + sumOdd);
    }
}
