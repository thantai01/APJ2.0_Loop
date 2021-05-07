package isPrime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is Prime check");
        System.out.println("Enter a number");
        float number;
        number = sc.nextFloat();

        if(Prime(number)) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
    }
    private static boolean Prime(float number) {
        if(number <2) return false;
        for (int i = 2;i < number;i++) {
            if(number%i ==0) return false;
        }
        return true;
    }




}
