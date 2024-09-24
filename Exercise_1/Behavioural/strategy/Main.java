package Exercise_1.Behavioural.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose payment method (1: Credit Card, 2: PayPal): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Credit Card Number: ");
            String cardNumber = scanner.next();
            cart.setPaymentStrategy(new CreditCardPayment(cardNumber));
        } else if (choice == 2) {
            System.out.print("Enter PayPal Email: ");
            String email = scanner.next();
            cart.setPaymentStrategy(new PayPalPayment(email));
        }

        System.out.print("Enter amount to pay: ");
        int amount = scanner.nextInt();
        cart.checkout(amount);
    }
}