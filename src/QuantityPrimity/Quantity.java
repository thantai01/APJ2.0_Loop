package QuantityPrimity;

import java.util.Scanner;

public class Quantity {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Pls enter a quantity ");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        System.out.print(quantityPrime(quantity));
    }

    private static int quantityPrime(int quantity) {
        int nums = 1;
        int count = 0;
        while (count < quantity) {
            if(primeCheck(nums)) {
                count++;
                System.out.print(nums + " ");
            }
            nums = nums + 1;
        } return nums;
    }

    private static boolean primeCheck(int nums) {
        if(nums < 2) return false;
        for (int i = 2; i<nums;i++){
            if(nums%i==0) return false;
        }
        return true;
    }
}
