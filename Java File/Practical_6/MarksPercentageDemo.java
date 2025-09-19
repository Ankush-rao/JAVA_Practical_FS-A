package Practical_6;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double m1, m2, m3;
    A(double a, double b, double c) {
        m1 = a; m2 = b; m3 = c;
    }
    double getPercentage() {
        return (m1 + m2 + m3) / 3.0;
    }
}
class B extends Marks {
    double m1, m2, m3, m4;
    B(double a, double b, double c, double d) {
        m1 = a; m2 = b; m3 = c; m4 = d;
    }
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4.0;
    }
}

public class MarksPercentageDemo {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 70);
        B studentB = new B(85, 75, 90, 80);

        System.out.printf("Student A Percentage: %.2f%%%n", studentA.getPercentage());
        System.out.printf("Student B Percentage: %.2f%%%n", studentB.getPercentage());
    }
}
