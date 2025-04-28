package homeworks.homework05;

public class IncomeTax {
    public static void main(String[] args) {
        int income = 10001;
        double incomeTax = 0.0;

        if (income <= 10000) {
            incomeTax = (income * 0.025);
        } else if (income <= 25000) {
            incomeTax = (income * 0.043);
        } else {
            incomeTax = (income * 0.067);
        }

        System.out.println(incomeTax);
    }

}
