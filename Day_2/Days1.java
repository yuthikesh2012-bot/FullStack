package Day_2;
import java.util.Scanner;
public class Days1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Day Number: ");
        int dayNumber = scanner.nextInt(); // Replace with the desired day number
        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("The day is a weekday.");
        } else {
            System.out.println("The day is a weekend.");
        }
        scanner.close();
    }
}
