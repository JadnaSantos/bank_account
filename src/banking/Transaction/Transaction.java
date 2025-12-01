package banking.Transaction;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timestamp;
    private String sourceAccount;
    private String destinationAccount;

    public Transaction(String type, double amount, String sourceAccount, String destinationAccount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " +
                "Type: " + type +
                ", Amount: $" + amount +
                (sourceAccount != null ? ", From: " + sourceAccount : "") +
                (destinationAccount != null ? ", To: " + destinationAccount : "");
    }
}
