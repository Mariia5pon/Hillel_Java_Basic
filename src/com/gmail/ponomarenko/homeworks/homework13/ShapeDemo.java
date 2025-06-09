package com.gmail.ponomarenko.homeworks.homework13;

import java.util.Arrays;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(1),
                new Triangle(new double[]{2, 3, 4}),
                new Square(5)
        };

        System.out.println("Shapes: " + Arrays.toString(shapes));
        double totalArea = totalArea(shapes);
        System.out.println("Total area is " + totalArea);
    }

    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}
