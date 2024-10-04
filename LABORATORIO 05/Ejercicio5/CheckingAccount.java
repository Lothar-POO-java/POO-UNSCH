package Ejercicio5;

// Subclase CuentaCorriente que permite sobregiros
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Sobrescribe el método retirar para permitir sobregiros
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, OverdraftLimitExceededException {
        if (amount > balance + overdraftLimit) {
            throw new OverdraftLimitExceededException("Overdraft limit exceeded.");
        }
        balance -= amount;
    }
}