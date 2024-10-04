package LABORATORIO01;

// Part 4: Employee Class

public class Employee {
    // Attributes for name, salary, and department
    private String name;
    private double salary; // Private attribute for salary
    String department; // Package-private attribute for department

    // Constructor to initialize attributes
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Method to get employee's name
    public String getName() {
        return name;
    }

    // Method to get employee's salary
    public double getSalary() {
        return salary;
    }

    // Method to set employee's salary (salary is private)
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}
