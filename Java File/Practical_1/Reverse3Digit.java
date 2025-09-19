package Practical_1;

import java.util.Scanner;
public class Reverse3Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit integer: ");
        int n = sc.nextInt();
        boolean negative = n < 0;
        n = Math.abs(n);
        if (n < 100 || n > 999) {
            System.out.println("Error: Not a 3-digit number.");
        } else {
            int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
            if (negative) rev = -rev;
            System.out.println("Reversed number = " + rev);
        }
        sc.close();
    }
}
