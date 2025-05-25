package com.gmail.ponomarenko.homeworks.homework10;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithMethods {
    public static void main(String[] args) {
        int number = readInt("1. Enter an integer number: ");
        System.out.printf("\tThe square of %d is %d.\n", number, square(number));

        double radius = readInt("2. Enter the radius of the cylinder: ");
        double height = readInt("\tEnter the height of the cylinder: ");
        System.out.printf("\tThe volume of a cylinder with a radius of %f and a height of %f is %f.\n", radius, height, cylinderVolume(radius, height));

        int size = readInt("3. Enter a size of the array: ");
        int[] array = randomArray(size);
        System.out.println("\tArray of numbers: ");
        print(array);
        System.out.printf("\tThe sum of all elements of the array is %d.\n", arraySum(array));

        String line = readString("4. Enter a string: ");
        System.out.printf("\tThe line is in reverse order: %s", reverseLine(line));
    }

    public static int readInt(String string) {
        System.out.printf(string);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static String readString(String string) {
        System.out.printf(string);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static int square(int arg) {
        return arg * arg;
    }

    public static double cylinderVolume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }

    public static int[] randomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        return array;
    }

    private static void print(int[] array) {
        System.out.print("\t[");
        if (array.length > 0) {
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            System.out.print(", " + element);
        }
        System.out.println("]");
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static String reverseLine(String line) {
        char[] chars = line.toCharArray();
        char[] reverseChars = new char[line.length()];
        for (int i = 1; i < line.length(); i++) {
            reverseChars[line.length() - 1 - i] = chars[i];
        }
        String reverseLine = new String(reverseChars);
        return reverseLine;
    }
}
