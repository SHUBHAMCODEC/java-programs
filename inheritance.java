import java.util.Scanner;

abstract class Shape {
    abstract void area(double... params);
}

class Triangle extends Shape {
    void area(double... params) {
        double base = params[0];
        double height = params[1];
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

class Rectangle extends Shape {
    void area(double... params) {
        double length = params[0];
        double breadth = params[1];
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Circle extends Shape {
    void area(double... params) {
        double radius = params[0];
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and height of the triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Shape triangle = new Triangle();
        triangle.area(base, height);

        System.out.println("Enter the length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Shape rectangle = new Rectangle();
        rectangle.area(length, breadth);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        Shape circle = new Circle();
        circle.area(radius);
    }
}
