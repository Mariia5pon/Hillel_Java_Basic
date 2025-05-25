package com.gmail.ponomarenko.homeworks.homework11;

public class PersonRunner {
    public static void main(String[] args) {
        Person john = new Person("John", 30, "Engineer");
        Person mary = new Person("Mary", 25, "Teacher");
        Person bob = new Person("Bob", 35, "Doctor");

        john.describe();
        mary.describe();
        bob.describe();

        mary.changeProfession("Designer");
        System.out.println("After changing professions:");
        mary.describe();
    }
}
