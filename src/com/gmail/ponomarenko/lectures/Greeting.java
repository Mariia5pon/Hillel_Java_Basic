package com.gmail.ponomarenko.lectures;

public class Greeting {
    public static void main(String[] args) {
        //System.out.println("Hello, " + args[0]); ---- Array's length = 0
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "anonymous";
        }
        System.out.println("Hello, " + name);
    }

    public static void print(String[] args) {
        System.out.println("Income arguments: ");
        for (String element : args) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }
}
