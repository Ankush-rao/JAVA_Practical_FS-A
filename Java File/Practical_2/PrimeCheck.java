package Practical_2;

import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer to check prime: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Number is Not Prime");
        } else {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { prime = false; break; }
            }
            System.out.println(prime ? "Number is Prime" : "Number is Not Prime");
        }
        sc.close();
    }
}
