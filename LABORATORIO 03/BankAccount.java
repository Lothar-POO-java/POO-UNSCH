package LABORATORIO02;

// Part 2: BankAccount Class

public class BankAccount {
    public String accountNumber;
    private double balance;
    protected String accountHolder;

    // Constructor
    BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money ensuring balance doesn't go negative
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}
