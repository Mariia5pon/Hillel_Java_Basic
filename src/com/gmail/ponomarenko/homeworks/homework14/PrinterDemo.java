package com.gmail.ponomarenko.homeworks.homework14;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer printer = new MessagePrinter();

        Message mariia = new Message("Hello, World!", "Mariia");
        Message anonymous = new Message("Hello, World!", null);
        Message empty = new Message(null, null);

        printer.print(mariia);
        printer.print(anonymous);
        printer.print(empty);
    }
}
