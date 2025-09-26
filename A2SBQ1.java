package Assingnment2;

interface Operation {
    double area();
    double volume();
}

class Circle implements Operation {
    double radius;
    static final double PI = 3.142;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double volume() {
        return 0; // Circle is a 2D shape
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}

public class A2SBQ1{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Volume: " + circle.volume());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}