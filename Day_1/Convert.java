import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double minutes = scanner.nextDouble();
        double hours = minutes / 60.0;
        System.out.println(hours + " hours.");
        scanner.close();
    }
    
}
