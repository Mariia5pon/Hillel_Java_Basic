package com.gmail.ponomarenko.homeworks.homework11;

public class Person {
    public String name;
    public int age;
    public String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void describe() {
        System.out.printf("Name: %s, Age: %d, Profession: %s.\n", name, age, profession);
    }

    public void changeProfession(String newProfession) {
        this.profession = newProfession;
    }
}


