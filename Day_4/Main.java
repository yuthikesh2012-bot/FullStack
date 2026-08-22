package Day_4;

class Calculator {
    int add(int a, int b) {
        System.out.println("Addition: " + (a + b));
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("Addition: " + (a + b));
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 10);
        calculator.add(5.5, 10.5);
    }
}
