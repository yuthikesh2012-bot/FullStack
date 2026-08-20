package Day_2;

import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day nam ");
        String dayname = scanner.nextLine(); // Replace with the desired day of the week

        switch (dayname) {
            case "Monday":
                dayname = "Monday";
                System.out.println("Today is Monday, " + dayname);
                break;
            case "Tuesday":
                dayname = "Tuesday";
                System.out.println("Today is Tuesday, " + dayname);
                break;
            case "Wednesday":
                dayname = "Wednesday";
                System.out.println("Today is Wednesday, " + dayname);
                break;
            case "Thursday":
                dayname = "Thursday";
                System.out.println("Today is Thursday, " + dayname);
                break;
            case "Friday":
                dayname = "Friday";
                System.out.println("Today is Friday, " + dayname);
                break;
            case "Saturday":
                dayname = "Saturday";
                System.out.println("Today is Saturday, " + dayname);
                break;
            case "Sunday":
                dayname = "Sunday";
                System.out.println("Today is Sunday, " + dayname);
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        scanner.close();
    }
}
