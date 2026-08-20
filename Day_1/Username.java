import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = Scanner.nextLine();
        if (username.equals("JohnDoe")) {
            System.out.print("Enter your password: ");
            String password = Scanner.nextLine();
            if (password.equals("password123")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password.");
                System.out.println("Enter your Password Again: ");
                String passwordAgain = Scanner.nextLine();
                if (passwordAgain.equals("password123")) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Incorrect password again.");
                }
                System.out.println("Would you like to reset your password? (yes/no)");
                String resetChoice = Scanner.nextLine();
                if (resetChoice.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the reset password: ");
                    String newPassword = Scanner.nextLine();
                    System.out.println("Password reset successful. Your new password is: " + newPassword);
                } else {
                    System.out.println("Password reset canceled.");
                }
            }
        } else {
            System.out.println("Incorrect username.");
        }
        Scanner.close();
    }
}
