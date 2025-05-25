package com.gmail.ponomarenko.homeworks.homework09;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int rows = readInt("rows");
        int columns = readInt("columns");
        int[][] matrix = randomMatrix(rows, columns);
        print(matrix);
        evenOddRowsSums(matrix);
        evenOddColumnsProduct(matrix);
        if (magicSquare(matrix)) {
            System.out.println("A matrix is a magic square.");
        } else {
            System.out.println("A matrix is not a magic square.");
        }
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
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 5);
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
            int rowSum = sumForRow(matrix[i]);

            if (i % 2 == 0) {
                sumEven += rowSum;
            } else {
                sumOdd += rowSum;
            }
        }
        System.out.println("Sum of elements in even rows: " + sumEven);
        System.out.println("Sum of elements in odd rows: " + sumOdd);
    }

    public static void evenOddColumnsProduct(int[][] matrix) {
        int productEven = 1;
        int productOdd = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                if (j % 2 != 0) {
                    productEven *= matrix[i][j];
                } else {
                    productOdd *= matrix[i][j];
                }
        }
        System.out.println("Product of elements in even columns: " + productEven);
        System.out.println("Product of elements in odd columns: " + productOdd);
    }

    public static int sumForRow(int[] row) {
        int sum = 0;
        for (int cell : row) {
            sum += cell;
        }
        return sum;
    }

    public static int sumForColumn(int[][] matrix, int column) {
        int sum = 0;
        for (int[] row : matrix) {
            sum += row[column];
        }
        return sum;
    }

    public static int sumPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static int sumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public static boolean magicSquare(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }

        int sample = sumForRow(matrix[0]);
        for (int i = 1; i < matrix.length; i++) {
            if (sample != sumForRow(matrix[i])) {
                return false;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (sample != sumForColumn(matrix, i)) {
                return false;
            }
        }

        if (sample != sumPrimaryDiagonal(matrix)) {
            return false;
        }

        if (sample != sumSecondaryDiagonal(matrix)) {
            return false;
        }
        return true;
    }
}

