package Loop;

import java.util.Scanner;

public class LoopRect {
    public static void main(String[] args) {
        System.out.println("Draw your structure");
        Scanner sc = new Scanner(System.in);
        int height,width;
        System.out.print("Enter a width: ");
        width = sc.nextInt();
        System.out.print("Enter a height : ");
        height = sc.nextInt();

        for(int i = 0;i < height ;i++) {
            for(int j = 0; j <width ;j++) {
                System.out.print("|#|");
            }
            System.out.println(" ");
        }
    }
}
