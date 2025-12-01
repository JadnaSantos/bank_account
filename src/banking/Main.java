package banking;

import banking.BankAccount.BankAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount accountA = new BankAccount("0001", "John Doe");
        BankAccount accountB = new BankAccount("0002", "Alice Brown");

        accountA.deposit(500);
        accountA.withdraw(100);
        accountA.transfer(150, accountB);

        accountA.showBalance();
        accountA.printTransactionHistory();

        accountB.showBalance();
        accountB.printTransactionHistory();
    }
}
