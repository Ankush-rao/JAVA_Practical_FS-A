package Practical_4;

import java.util.Scanner;
class Area {
    double length, breadth;
    Area(double l, double b) { length = l; breadth = b; }
    double returnArea() { return length * breadth; }
}
public class RectangleAreaWithConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Area rect = new Area(l, b);
        System.out.println("Area = " + rect.returnArea());
        sc.close();
    }
}
