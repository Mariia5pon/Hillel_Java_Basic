package com.gmail.ponomarenko.lectures.lecture07;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random(10);

        for (int i = 0; i < args.length; i++) {
            array[i] = random.nextInt(-10_000, 10_000);
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-10000, 10000);
            System.out.println(array[i]);
        }
    }
}
