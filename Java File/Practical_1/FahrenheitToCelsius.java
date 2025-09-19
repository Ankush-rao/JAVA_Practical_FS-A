package Practical_1;

import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5.0 / 9.0;
        System.out.printf("Celsius equivalent: %.2f °C%n", c);
        sc.close();
    }
}
