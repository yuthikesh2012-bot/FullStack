package Day_3;

import java.util.Scanner;
public class Calculator {
    public static void displayCalculator(){
        System.out.println("------------------------------");
        System.out.println("Welcome to Calculator");
        System.out.println("------------------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }
    public static int Addition(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){
        return a - b;
    }
    public static int Multiplication(int a, int b){
        return a * b;
    }
    public static int Division(int a, int b){
        if(b != 0){
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 or handle the error as needed
        }
    }
    public static void main(String[] args){
        displayCalculator();
        System.out.println("Your calculator is ready");
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum, difference, product, quotient;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.print("Select an operation (1-4): ");
        switch (scanner.nextInt()) {
            case 1:
                sum = Addition(num1, num2);
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                difference = Subtraction(num1, num2);
                System.out.println("The difference is: " + difference);
                break;
            case 3:
                product = Multiplication(num1, num2);
                System.out.println("The product is: " + product);
                break;
            case 4:
                quotient = Division(num1, num2);
                if (num2 != 0) {
                    System.out.println("The quotient is: " + quotient);
                    System.out.println("The remainder is: " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
        scanner.close();
    }
}
