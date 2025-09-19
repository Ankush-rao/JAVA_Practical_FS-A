package Practical_2;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        if (n <= 0) System.out.println("Enter positive integer.");
        else {
            long a = 0, b = 1;
            System.out.print("Fibonacci series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i==n ? "" : " "));
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
        sc.close();
    }
}
