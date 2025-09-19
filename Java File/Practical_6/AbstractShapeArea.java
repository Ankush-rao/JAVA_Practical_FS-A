package Practical_6;

abstract class Shape {
    abstract void rectangleArea(double l, double b);
    abstract void squareArea(double side);
    abstract void circleArea(double r);
}

class Area extends Shape {
    void rectangleArea(double l, double b) {
        System.out.println("Rectangle Area = " + (l * b));
    }
    void squareArea(double side) {
        System.out.println("Square Area = " + (side * side));
    }
    void circleArea(double r) {
        System.out.println("Circle Area = " + (Math.PI * r * r));
    }
}

public class AbstractShapeArea {
    public static void main(String[] args) {
        Area a = new Area();
        a.rectangleArea(4, 5);
        a.squareArea(3);
        a.circleArea(2.5);
    }
}
