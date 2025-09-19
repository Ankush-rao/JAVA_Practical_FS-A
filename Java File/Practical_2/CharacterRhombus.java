package Practical_2;

import java.util.Scanner;
public class CharacterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter character to build rhombus (e.g. A): ");
            char ch = sc.next().charAt(0);
            System.out.print("Enter number of rows (odd recommended): ");
            int n = sc.nextInt();
            int mid = (n + 1) / 2;
            
            for (int i = 1; i <= mid; i++) {
                for (int j = 1; j <= mid - i; j++) System.out.print("  ");
                for (int j = 1; j <= 2*i - 1; j++) System.out.print(ch + " ");
                System.out.println();
            }
           
            for (int i = mid - 1; i >= 1; i--) {
                for (int j = 1; j <= mid - i; j++) System.out.print("  ");
                for (int j = 1; j <= 2*i - 1; j++) System.out.print(ch + " ");
                System.out.println();
            }
            System.out.print("Try again? (Y to continue, N to exit): ");
            choice = sc.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        sc.close();
    }
}
