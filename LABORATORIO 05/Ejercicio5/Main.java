package Ejercicio5;

public class Main {
    public static void main(String[] args) throws OverdraftLimitExceededException{
        // Parte 05: Excepciones Personalizadas
        BankAccount account = new BankAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);

        try {
            account.withdraw(1200); // Lanza InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkingAccount.withdraw(1600); // Lanza OverdraftLimitExceededException
        } catch (InsufficientBalanceException | OverdraftLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}


// VELARDE YLLISCA JHON EYMER      27222126