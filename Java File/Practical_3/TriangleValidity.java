package Practical_3;

import java.util.Scanner;
public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles (deg): ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0)
            System.out.println("Triangle is valid.");
        else
            System.out.println("Triangle is NOT valid.");
        sc.close();
    }
}
