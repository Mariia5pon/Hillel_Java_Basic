package com.gmail.ponomarenko.homeworks.homework10;

import java.util.Scanner;

public class WorkingWithMethods {
    public static void main(String[] args) {
        int number = readInt("1. Enter an integer number: ");
        System.out.printf("\tThe square of %d is %d.\n", number, square(number));
        double radius = readInt("2. Enter the radius of the cylinder: ");
        double height = readInt("\tEnter the height of the cylinder: ");
        System.out.printf("\tThe volume of a cylinder with a radius of %f and a height of %f is %f.", radius, height, cylinderVolume(radius, height));
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

    public static double cylinderVolume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }
}
