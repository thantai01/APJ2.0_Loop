package AppMenu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Choose one function below");
        System.out.println("1.Draw a triangle");
        System.out.println("2.Draw a rectangle");
        System.out.println("3.Exit");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose) {
            case 1:drawTriangle();break;
            case 2:;break;
        }
    }

    public static void drawTriangle() {
        System.out.println("Which s: ");
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        switch (nums) {
            case 1:
        }
    }
}
