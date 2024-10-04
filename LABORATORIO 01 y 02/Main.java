package LABORATORIO01;

public class Main {
    public static void main(String[] args) {
        // Testing the BankAccount class
        BankAccount myAccount = new BankAccount("John Doe", "123456789", 500.0);
        myAccount.deposit(150.0);
        myAccount.withdraw(200.0);
        System.out.println("Current balance: " + myAccount.checkBalance());

        // Testing the Calculator class
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 10));
        System.out.println("Subtraction: " + calc.subtract(20, 5));
        System.out.println("Multiplication: " + calc.multiply(3, 4));
        System.out.println("Division: " + calc.divide(10, 2));
        System.out.println("Division by zero: " + calc.divide(10, 0));

        // Testing the Employee class
        Employee emp = new Employee("Jane Smith", 75000, "HR");
        System.out.println("Employee Name: " + emp.getName());
        emp.setSalary(80000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
