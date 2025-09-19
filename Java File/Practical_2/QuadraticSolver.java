package Practical_2;

import java.util.Scanner;
public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a b c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation (a == 0).");
        } else {
            double d = b*b - 4*a*c;
            if (d > 0) {
                double r1 = (-b + Math.sqrt(d)) / (2*a);
                double r2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("Two real roots: " + r1 + " and " + r2);
            } else if (d == 0) {
                double r = -b / (2*a);
                System.out.println("One repeated root: " + r);
            } else {
                double real = -b / (2*a);
                double imag = Math.sqrt(-d) / (2*a);
                System.out.printf("Complex roots: %.4f + %.4fi and %.4f - %.4fi%n", real, imag, real, imag);
            }
        }
        sc.close();
    }
}
