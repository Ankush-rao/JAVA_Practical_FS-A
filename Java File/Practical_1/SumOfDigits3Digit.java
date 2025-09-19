package Practical_1;

import java.util.Scanner;
public class SumOfDigits3Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit integer: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        if (n < 100 || n > 999) {
            System.out.println("Error: Not a 3-digit number.");
        } else {
            int d1 = n % 10;
            int d2 = (n / 10) % 10;
            int d3 = n / 100;
            int sum = d1 + d2 + d3;
            System.out.println("Sum of digits = " + sum);
        }
        sc.close();
    }
}
