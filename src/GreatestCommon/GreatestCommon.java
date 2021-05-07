package GreatestCommon;

import java.util.Scanner;

public class GreatestCommon {
    public static void main(String[] args) {
        int nums1,nums2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        nums1 = sc.nextInt();
        System.out.println("Enter a number 2");
        nums2 = sc.nextInt();

        nums1 = Math.abs(nums1);
        nums2 = Math.abs(nums2);

        if(nums1 ==0 || nums2 ==0)
            System.out.println("No greatest common factor here");
        while(nums1 != nums2) {
            if(nums1 > nums2) nums1 = nums1 - nums2;
            else  nums2 = nums2 - nums1;
        }
        System.out.println("The greatest common factor is : " + nums1);
    }
}
