package com.gmail.ponomarenko.homeworks.homework13;

import java.util.Arrays;

public class Triangle implements Shape {
    private double[] sides;

    public Triangle(double[] sides) {
        this.sides = Arrays.copyOf(sides, sides.length);
    }

    @Override
    public double area() {
        double semiPerimeter = 0;
        for (double side : sides) {
            semiPerimeter += side;
        }
        semiPerimeter /= 2.0;

        return  Math.sqrt(semiPerimeter *
                (semiPerimeter - sides[0]) *
                (semiPerimeter - sides[1]) *
                (semiPerimeter - sides[2]));
    }
}
