package InterestRate;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your money");
        float money;
        money = sc.nextFloat();
        System.out.print("Enter a period");
        int month;
        month = sc.nextInt();
        System.out.println("Interest Rate now is : 5.5% per year!");
        System.out.print("Your interestMoney after " + month + " is: " + interestMoney(money,month));

    }
    private static double interestMoney(float money,int month) {
        float interestMoney;
        float interestRate = (float) 0.055;
        interestMoney = money * interestRate/12 * month;
        return interestMoney;
    }
}
