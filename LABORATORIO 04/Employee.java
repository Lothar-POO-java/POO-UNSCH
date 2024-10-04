package LABORATORIO04;

// Base class: Employee

public class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate a bonus (10% of the salary)
    double calculateBonus() {
        return salary * 0.10;
    }
}

// Derived class: Manager
class Manager extends Employee {

    // Constructor
    Manager(String name, double salary) {
        super(name, salary); // Call the constructor of the base class
    }

    // Overridden method to calculate a bonus (15% of the salary)
    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}