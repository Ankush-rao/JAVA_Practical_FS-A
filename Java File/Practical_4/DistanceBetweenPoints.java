package Practical_4;

class Point {
    double x, y;
    Point() { x = 0; y = 0; }
    Point(double x, double y) { this.x = x; this.y = y; }
    static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x, dy = p1.y - p2.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    void display() {
        System.out.printf("(%7.2f, %7.2f)%n", x, y);
    }
}
public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Point p1 = new Point(1.5, 2.5);
        Point p2 = new Point(5.0, 7.0);
        System.out.print("Point 1: "); p1.display();
        System.out.print("Point 2: "); p2.display();
        System.out.printf("Distance = %.2f%n", Point.distance(p1, p2));
    }
}
