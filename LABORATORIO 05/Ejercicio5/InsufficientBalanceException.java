package Ejercicio5;

// Excepción personalizada para saldo insuficiente
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Excepción personalizada para exceder el límite de sobregiro
class OverdraftLimitExceededException extends Exception {
    public OverdraftLimitExceededException(String message) {
        super(message);
    }
}
