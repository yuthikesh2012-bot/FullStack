package Day_4;
import java.util.Scanner;

class AreaCalculator {
    double calculateRectangleArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
        return area;
    }

    double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }

    double calculateSquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
        return area;
    }
}
public class AreaCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        areaCalculator.calculateRectangleArea(length, width);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        areaCalculator.calculateCircleArea(radius);

        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        areaCalculator.calculateSquareArea(side);
    }
}