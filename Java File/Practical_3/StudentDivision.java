package Practical_3;

import java.util.Scanner;
public class StudentDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 1; i <= 5; i++) {
            sum += sc.nextDouble();
        }
        double percent = sum / 5.0;
        if (percent >= 60) System.out.println("First division");
        else if (percent >= 50) System.out.println("Second division");
        else if (percent >= 40) System.out.println("Third division");
        else System.out.println("Fail");
        sc.close();
    }
}
