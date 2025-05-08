package com.gmail.ponomarenko.homeworks.homework04;

/*
Copy code
Product No 1: smartphone,
total sales for 5 days is EUR 12153,41,
sales by day is EUR 2430,68.
Product No 2: laptop,
total sales for 7 days is EUR 10486,85,
sales by day is EUR 1498,12.
 */
public class TotalSales {
    public static void main(String[] args) {
        int number = 1;
        String product = "smartphone";
        double totalSales = 12153.41;
        int days = 5;
        double salesByDay = totalSales / days;

        System.out.printf("Product No %d: %s,\n", number, product);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, totalSales);
        System.out.printf("sales by day is EUR %.2f \n", salesByDay);

        number = 2;
        product = "laptop";
        totalSales = 10486.85;
        days = 7;
        salesByDay = totalSales / days;

        System.out.printf("Product No %d: %s,\n", number, product);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, totalSales);
        System.out.printf("sales by day is EUR %.2f \n", salesByDay);
    }
}
