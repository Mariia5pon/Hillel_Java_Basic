package homeworks.homework05;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your income:");
        double income = myObj.nextDouble();
        double incomeTax = 0.0;

        if (income <= 10000) {
            incomeTax = (income * 0.025);
        } else if (income <= 25000) {
            incomeTax = (income * 0.043);
        } else {
            incomeTax = (income * 0.067);
        }

        System.out.printf("Calculated tax amount based on the entered income: %.2f", incomeTax);
    }

}
