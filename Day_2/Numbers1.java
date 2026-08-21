import java.util.Scanner;
public class Numbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(i);
        }
    }
}