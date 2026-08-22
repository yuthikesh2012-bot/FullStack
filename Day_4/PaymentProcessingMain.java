package Day_4;
import java.util.Scanner;

class PaymentProcessing {
    void processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Processing payment of: " + amount);
        } else {
            System.out.println("Payment amount must be positive.");
        }
    }

    double payCash(double amount) {
        if (amount > 0) {
            System.out.println("Paid cash: " + amount);
            return amount;
        } else {
            System.out.println("Cash payment amount must be positive.");
            return 0;
        }
    }

    double payCard(double amount, long cardNumber, String cardHolderName) {
        if (amount > 0) {
            System.out.println("Entering card details: Card Number: " + cardNumber + ", Card Holder: " + cardHolderName);
            System.out.println("Paid by card: " + amount);
            return amount;
        } else {
            System.out.println("Card payment amount must be positive.");
            return 0;
        }
    }

    double payUPI(double amount, String upiId) {
        if (amount > 0) {
            System.out.println("Entering UPI ID: " + upiId);
            System.out.println("Paid via UPI: " + amount);
            return amount;
        } else {
            System.out.println("UPI payment amount must be positive.");
            return 0;
        }
    }
}
public class PaymentProcessingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessing paymentProcessing = new PaymentProcessing();

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        paymentProcessing.processPayment(amount);

        System.out.print("Enter cash payment amount: ");
        double cashAmount = scanner.nextDouble();
        paymentProcessing.payCash(cashAmount);

        System.out.print("Enter card payment amount: ");
        double cardAmount = scanner.nextDouble();
        paymentProcessing.payCard(cardAmount, 1234567890123456L, "John Doe");

        System.out.print("Enter UPI payment amount: ");
        double upiAmount = scanner.nextDouble();
        paymentProcessing.payUPI(upiAmount, "john.doe@upi");
    }
}