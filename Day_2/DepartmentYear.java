import java.util.Scanner;
public class DepartmentYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the department number: ");
        int departmentNumber = scanner.nextInt(); // Replace with the desired department number
        System.out.print("Enter the year: ");
        int year = scanner.nextInt(); // Replace with the desired year

        switch (departmentNumber) {
            case 1:
                System.out.println("Department: CSE");
                break;
            case 2:
                System.out.println("Department: ECE");
                break;
            default:
                System.out.println("Invalid department number");
        }

        switch (year) {
            case 1:
                System.out.println("Year: First Year");
                break;
            case 2:
                System.out.println("Year: Second Year");
                break;
            case 3:
                System.out.println("Year: Third Year");
                break;
            case 4:
                System.out.println("Year: Fourth Year");
                break;
            default:
                System.out.println("Invalid year");
        }
        scanner.close();
    }
}
