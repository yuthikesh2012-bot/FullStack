import java.util.Scanner;
public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Restaurant Menu========");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Coffee");
        System.out.println("================================");
        System.out.print("Enter the menu item number: ");
        int menuItemNumber = scanner.nextInt(); // Replace with the desired menu item number
        switch (menuItemNumber) {
            case 1:
                System.out.println("Pizza");
                System.out.println("========Pizza Sizes========");
                System.out.println("1. Small (Rs. 150)");
                System.out.println("2. Medium (Rs. 250)");
                System.out.println("3. Large (Rs. 350)");
                System.out.print("Enter the pizza size number: ");
                int Pizza = scanner.nextInt(); // Replace with the desired pizza
                System.out.println("========Pizza Prices========");
                switch (Pizza) {
                    case 1:
                        System.out.println("Small Rs. 150");
                        break;
                    case 2:
                        System.out.println("Medium Rs. 250");
                        break;
                    case 3:
                        System.out.println("Large Rs. 350");
                        break;
                }
                break;
            case 2:
                System.out.println("Burger");
                System.out.println("========Burger Options========");
                System.out.println("1. Vegetarian (Rs. 100)");
                System.out.println("2. Non-Vegetarian (Rs. 200)");
                System.out.print("Enter the burger option number: ");
                int Burger = scanner.nextInt(); // Replace with the desired burger option
                switch (Burger) {
                    case 1:
                        System.out.println("Vegetarian Rs. 100");
                        break;
                    case 2:
                        System.out.println("Non-Vegetarian Rs. 200");
                        break;
                }
                break;
            case 3:
                System.out.println("Coffee");
                System.out.println("========Coffee Options========");
                System.out.println("1. Regular (Rs. 80)");
                System.out.println("2. Large (Rs. 120)");
                System.out.print("Enter the coffee option number: ");
                System.out.println("========Coffee Prices========");
                int CoffeeOption = scanner.nextInt(); // Replace with the desired coffee option
                switch (CoffeeOption) {
                    case 1:
                        System.out.println("Regular Rs. 80");
                        break;
                    case 2:
                        System.out.println("Large Rs. 120");
                        break;
                }
                break;
        }
        scanner.close();
    }
}
