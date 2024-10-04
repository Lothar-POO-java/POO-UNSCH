package Ejercicio5;

// Clase base CuentaBancaria
class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Método para retirar dinero
    public void withdraw(double amount) throws InsufficientBalanceException, OverdraftLimitExceededException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for this operation.");
        }
        balance -= amount;
    }
}


