package LABORATORIO01;

// Part 1 and 2: BankAccount Class

public class BankAccount {
    // Attributes for account holder, account number, and balance
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize attributes
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check the balance
    public double checkBalance() {
        return balance;
    }
}
