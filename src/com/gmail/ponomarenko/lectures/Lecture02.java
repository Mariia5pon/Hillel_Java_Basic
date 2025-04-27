package com.gmail.ponomarenko.lectures;

import java.util.Arrays;

public class Lecture02 {
    int field = 10;

    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean flag = false; // оголошення змінної, містить тільки true/false, обов'язково;
        //System.out.println(flag); - error, тому що не викликана, не присвоєне ім'я
        // or true
        System.out.println(flag);
        System.out.println(" -=BYTE=- ");
        byte number = 127; // 256 (-128 до 127) 8 байт чи
        System.out.println("number = " + number);
        number += 1;
        System.out.println("number = " + number);  // -128, тому що
        byte value = 1; // byte, але визначає як int
        // byte byteResult = number + value; помилка, бо явно додаємо int + byte, коли хочемо зберегти в змінну типу byte
        byte byteResult = (byte) (number + value); // явне перетворення "explicit casting" or "down cast"
        System.out.println("BYTE RESULT = " + byteResult);
        System.out.println("-= INT =-");
        int a = 1000; // 32bit -2*10^9 до 2*10^9
        int b = 97455;
        int result = a+b;
        int division = a/b; // result = int
        System.out.println("result = " + result);

        a = 123;
        a = a + 1;
        System.out.println("a = " + a);
        a += 10 / 2 - 4; // спочатку вираз вираховується, а потім до змінної
        System.out.println("a = " + a);
        a++;
        a++; // інкремент
        System.out.println("a = " + a);
        a = number + value; // "up casting" or "implicit casting" неявне перетворення типів чи підвищення типів
        a = 100_000;
        System.out.println(a);

        a = 16;
        System.out.println(a);
        a = 0b10000;  // warning: variable is already assigned to this value
        System.out.println(a);

        a = 0x10;
        System.out.println(a);

        a = 020;
        System.out.println(a);

        long big = 546546854651547895L; // -2*10^31 до 2*10^31  / 546546854651547895 error without L, l маленьку краще не вик-ти, бо легко сплутати з 1
        System.out.println(big);

        double d = 12837.34, pi = 3.1415, e; // погано за конвенцією
        float f = 1.234F; // автоматично літерується як дабл, але якщо треба оптимізувати пам'ять то флоат краще

        float f1 = 0.1F;
        f1 = 10 * f1;

        float f2 = 0;
        f2 = f +0.2F;
        // дабл і флоат неточні, краще не вик-ти для банкінгу і т.д.

        // CHAR utf8
        char ch = 'A';
        System.out.println(ch);
        ch += 1;
        System.out.println(ch);
        System.out.println((int) ch);
        ch = '\u0042';
        System.out.println(ch);

        String line = "some text";
        System.out.println(line);
        line = line + 1 + 2 + 3;
        System.out.println(line);
        line = "123.45";
        d = Double.valueOf(line); // wrapping-class
        System.out.println(d);
    }
}