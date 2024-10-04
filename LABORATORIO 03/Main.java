package LABORATORIO02;

public class Main {
    public static void main(String[] args) {
        // Testing Person class
        Person person = new Person("John", 25, "john@example.com");
        System.out.println("Name: " + person.getName());
        person.setAge(26);
        System.out.println("Updated Age: " + person.getAge());

        // Testing BankAccount class
        BankAccount account = new BankAccount("12345", 1000.0, "John Doe");
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Balance: " + account.getBalance());

        // Testing Circle class
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Testing Utilities class
        double fahrenheit = Utilities.convertCelsiusToFahrenheit(25);
        System.out.println("25°C in Fahrenheit: " + fahrenheit);
    }
}
