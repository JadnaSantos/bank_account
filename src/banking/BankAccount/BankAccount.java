package banking.BankAccount;

import banking.Transaction.Transaction;
import java.util.List;
import java.util.ArrayList;

public class BankAccount {
    private String idNumber;
    private String fullName;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    private boolean isInvalidAmount(double amount, String operation) {
        if (amount <= 0) {
            System.out.println("Invalid amount for " + operation + ": $" + amount);
            return true;
        }
        return false;
    }

    private void recordTransaction(String type, double amount, String destinationAccount) {
        transactions.add(
                new Transaction(type, amount, this.fullName, destinationAccount)
        );
    }

    public boolean withdraw(double amount) {
        if (isInvalidAmount(amount, "withdraw")) return false;

        if (amount > this.balance) {
            System.out.println("Insufficient balance: $" + amount);
            return false;
        }

        this.balance -= amount;
        recordTransaction("WITHDRAW", amount, null);

        System.out.println("Withdrawal completed: $" + amount);
        return true;
    }

    public boolean deposit(double amount) {
        if (isInvalidAmount(amount, "deposit")) return false;

        this.balance += amount;
        recordTransaction("DEPOSIT", amount, null);

        System.out.println("Deposit completed: $" + amount);
        return true;
    }

    public boolean transfer(double amount, BankAccount destinationAccount) {
        if (destinationAccount == null) {
            System.out.println("Invalid destination account.");
            return false;
        }

        if (isInvalidAmount(amount, "transfer")) return false;

        if (!this.withdraw(amount)) return false;

        destinationAccount.deposit(amount);

        recordTransaction("TRANSFER", amount, destinationAccount.getFullName());

        System.out.println("Transfer completed: $" + amount +
                " to " + destinationAccount.getFullName());

        return true;
    }

    public void showBalance() {
        System.out.println("Balance for " + fullName + ": $" + balance);
    }

    public void printTransactionHistory() {
        System.out.println("\n--- Transaction History for " + fullName + " ---");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }
}
