package Practical_5;

import java.util.Scanner;

// Base class
class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

// Car class
class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car");
    }
}

// Bike class
class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike");
    }
}

// Main class
public class VehicleFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tyres (N): ");
        int N = sc.nextInt();

        Vehicle v; // reference variable

        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
                break;
        }

        v.display();
        sc.close();
    }
}
