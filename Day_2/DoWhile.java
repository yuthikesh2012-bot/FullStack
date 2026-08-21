import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (number <= 0);
        System.out.println("Valid Number : " + number);
        scanner.close();
    }
}