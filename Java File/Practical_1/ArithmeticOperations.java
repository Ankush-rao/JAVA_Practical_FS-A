package Practical_1;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 25;
        int b = 7;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;     
        int mod = a % b;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + diff);
        System.out.println("Multiplication = " + prod);
        System.out.println("Division = " + quot);
        System.out.println("Modulus = " + mod);
    }
}
