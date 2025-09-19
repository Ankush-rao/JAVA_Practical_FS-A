package Practical_4;

class Student {
    String name;
    int roll_no;
}
public class StudentExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll_no = 2;
        s.name = "John";
        System.out.println("Name: " + s.name + ", Roll No: " + s.roll_no);
    }
}
