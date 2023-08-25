package com.objects;

import java.util.Scanner;
public class PaymentGateway {
    public static void main(String[] args) {
        // Declare variables
        double amount = 0;
        String name = "";
        String cardNumber = "";
        String expiryDate = "";
        String cvv = "";
        double balance = 1000;
        String paymentType = "";
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);
        // Get user input for amount
        System.out.print("Enter amount: ");
        amount = scanner.nextDouble();
        // Get user input for name
        System.out.print("Enter name: ");
        name = scanner.next();
        // Get user input for card number
        System.out.print("Enter card number: ");
        cardNumber = scanner.next();
        // Get user input for expiry date
        System.out.print("Enter expiry date: ");
        expiryDate = scanner.next();
        // Get user input for CVV
        System.out.print("Enter CVV: ");
        cvv = scanner.next();
        // Get user input for payment type
        System.out.print("Enter payment type (credit/debit): ");
        paymentType = scanner.next();
        // Check if payment type is valid
        if (!paymentType.equalsIgnoreCase("credit") && !paymentType.equalsIgnoreCase("debit")) {
            System.out.println("Invalid payment type");
            System.exit(0);
        }
        // Check if amount is valid
        if (amount <= 0) {
            System.out.println("Invalid amount");
            System.exit(0);
        }
        // Check if balance is sufficient
        if (paymentType.equalsIgnoreCase("credit")) {
            if (amount > balance) {
                System.out.println("Insufficient balance");
                System.exit(0);
            }
        }
        // Process payment
        if (paymentType.equalsIgnoreCase("credit")) {
            balance -= amount;
            System.out.println("Payment successful");
        } else {
            balance += amount;
            System.out.println("Payment successful");
        }
        // Display balance
        System.out.println("Current balance: " + balance);
    }
}
