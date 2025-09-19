package Practical_3;

import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer age.");
            sc.close();
            return;
        }
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Eligible to vote.");
        else System.out.println("Not eligible to vote.");
        sc.close();
    }
}
