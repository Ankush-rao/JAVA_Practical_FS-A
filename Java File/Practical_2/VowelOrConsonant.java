package Practical_2;

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String s = sc.next();
        if (s.length() != 1 || !Character.isLetter(s.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet letter.");
        } else {
            char ch = Character.toLowerCase(s.charAt(0));
            if ("aeiou".indexOf(ch) >= 0) System.out.println("Vowel");
            else System.out.println("Consonant");
        }
        sc.close();
    }
}
