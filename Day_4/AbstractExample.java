package Day_4;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void draw() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Shape shape = new Circle(5.0);
        shape.draw();
        shape = new Rectangle(4.0, 6.0);
        shape.draw();
    }
}