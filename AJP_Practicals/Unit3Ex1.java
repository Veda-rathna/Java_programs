package AJP_Practicals;

//Stream Operations - Filtering, Mapping, And Reducing.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
class Transaction {

    private int transactionId;
    private int customerId;
    private double amount;
    private String status;

    public Transaction(int transactionId, int customerId, double amount, String status) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.amount = amount;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}

public class Unit3Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of transactions
        System.out.println("Enter the number of transactions:");
        int n = scanner.nextInt();

        // Read transaction data
        List<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter transaction ID, customer ID, amount, and status:");
            int transactionId = scanner.nextInt();
            int customerId = scanner.nextInt();
            double amount = scanner.nextDouble();
            String status = scanner.next();

            transactions.add(new Transaction(transactionId, customerId, amount, status));
        }

        // Step 1: Filter only the completed transactions
        List<Transaction> completedTransactions = transactions.stream()
                .filter(transaction -> "completed".equalsIgnoreCase(transaction.getStatus()))
                .collect(Collectors.toList());

        // Step 2: Map to get the list of transaction amounts
        List<Double> amounts = completedTransactions.stream()
                .map(Transaction::getAmount)
                .collect(Collectors.toList());

        // Step 3: Reduce to calculate the total amount
        double totalAmount = amounts.stream()
                .reduce(0.0, Double::sum);

        System.out.println("Total amount of completed transactions: " + totalAmount);

        scanner.close();
    }
}
