import java.util.Scanner;
public class PlacementEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        System.out.print("Enter your attendance percentage: ");
        int attendance = scanner.nextInt();
        int cgpa = (marks / 10) + (attendance / 10);
        System.out.print("Enter your cgpa: ");
        cgpa = scanner.nextInt();
        int arrears = (100 - attendance) / 10;
        System.out.print("Enter your arrears: ");
        arrears = scanner.nextInt();
        System.out.println("Your arrears are: " + arrears);
        if (marks >= 60 && attendance >= 75 && cgpa >= 7 && arrears == 0) {
            System.out.println("You are eligible for placement.");
        } else {
            System.out.println("You are not eligible for placement.");
        }
        scanner.close();
    }
}
