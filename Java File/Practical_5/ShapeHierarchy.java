package Practical_5;

class Shape {
    void show() { System.out.println("This is shape"); }
}
class RectangleShape extends Shape {
    void show() { System.out.println("This is rectangular shape"); }
}
class CircleShape extends Shape {
    void show() { System.out.println("This is circular shape"); }
}
class Square extends RectangleShape {
    void showSquare() { System.out.println("Square is a rectangle"); }
    void callParentMethods() {
        super.show();
       
}
public class ShapeHierarchy {
    public static void main(String[] args) {
        Square s = new Square();
        s.show();      
        s.showSquare();  
        
        Shape sh = new Shape();
        sh.show(); 
    }
}
}
