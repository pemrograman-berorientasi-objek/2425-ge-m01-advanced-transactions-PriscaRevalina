package fintech.model;

/**
 * @author 12S23025-Alif Aflah Suedi
 * @author 12S23039-Prisca R. Manurung
 */


import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String owner;
    private final String accountName;
    private double balance;
    private final List<Transaction> transactions;

    // Existing constructor
    public Account(String owner, String accountName, double balance) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    // New constructor
    public Account(String command, String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0; // Default balance
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        balance += transaction.getAmount();
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }

} 