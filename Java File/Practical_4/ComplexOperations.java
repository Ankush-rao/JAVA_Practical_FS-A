package Practical_4;

import java.util.Scanner;
class Complex {
    double real, imag;
    Complex(double r, double i) { real = r; imag = i; }
    Complex add(Complex o) { return new Complex(real + o.real, imag + o.imag); }
    Complex sub(Complex o) { return new Complex(real - o.real, imag - o.imag); }
    Complex mul(Complex o) { return new Complex(real*o.real - imag*o.imag, real*o.imag + imag*o.real); }
    public String toString() {
        return String.format("%.2f %s %.2fi", real, (imag < 0 ? "-" : "+"), Math.abs(imag));
    }
}
public class ComplexOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imag for first complex: ");
        Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter real and imag for second complex: ");
        Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());
        System.out.println("Sum = " + c1.add(c2));
        System.out.println("Difference = " + c1.sub(c2));
        System.out.println("Product = " + c1.mul(c2));
        sc.close();
    }
}
