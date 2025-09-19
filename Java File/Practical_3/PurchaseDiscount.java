package Practical_3;

import java.util.Scanner;
public class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();
        double total = qty * price;
        if (qty > 1000) {
            total = total * 0.90; // 10% discount
        }
        System.out.printf("Total expense = %.2f%n", total);
        sc.close();
    }
}
