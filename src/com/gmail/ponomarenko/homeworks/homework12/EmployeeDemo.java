package com.gmail.ponomarenko.homeworks.homework12;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee mariia = new Employee("Mariia Ponomarenko", "Manager", "mariia5pon@gmail.com", "+380671234567", 25);

        System.out.println("Current position: " + mariia.getPosition() + ".");
        mariia.setPosition("Team Lead");
        System.out.println("Updated position: " + mariia.getPosition() + ".");
    }
}

