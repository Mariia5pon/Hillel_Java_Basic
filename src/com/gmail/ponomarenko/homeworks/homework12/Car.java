package com.gmail.ponomarenko.homeworks.homework12;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car started!");
    }

    private void startElectricity() {
        System.out.println("1. Electricity started");
    }

    private void startCommand() {
        System.out.println("2. Command accepted");
    }

    private void startFuelSystem() {
        System.out.println("3. Fuel system activated");
    }
}
