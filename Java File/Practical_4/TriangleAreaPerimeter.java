package Practical_4;

class Triangle {
    double a, b, c;
    Triangle() { a = 3; b = 4; c = 5; }
    double perimeter() { return a + b + c; }
    double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
public class TriangleAreaPerimeter {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area = " + t.area());
        System.out.println("Perimeter = " + t.perimeter());
    }
}
