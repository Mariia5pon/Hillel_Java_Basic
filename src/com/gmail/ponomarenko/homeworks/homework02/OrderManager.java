package com.gmail.ponomarenko.homeworks.homework02;

public class OrderManager {
    public static void main(String[] args) {
        printOrder(1, "Alice", "smartphone", 305.99, "Moon Street, 10");
        printOrder(2, "Tom", "laptop", 570.95, "Terra Street, 17");
    }

    public static void printOrder(int number, String client, String product, double price, String address) {
        System.out.println("Order No " + number + ' ' + "Client: " + client + "." + '\n' +
                "Product: " + product + "," + '\n' +
                "price EUR " + price + "." + '\n' +
                "Address: " + address + ".");
    }
}
