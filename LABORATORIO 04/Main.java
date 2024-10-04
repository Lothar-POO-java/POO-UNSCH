package LABORATORIO04;

// Main class to test the hierarchy

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice", 50000);
        System.out.println("Employee Bonus: " + emp.calculateBonus());

        // Create a Manager object
        Manager mgr = new Manager("Bob", 70000);
        System.out.println("Manager Bonus: " + mgr.calculateBonus());

        // Creating and displaying a car object
        Car myCar = new Car("Toyota", "Corolla", 2020, 1800, 4);
        System.out.println("Car Details:");
        myCar.displayInfo();

        // Creating and displaying a motorcycle object
        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR", 2019, 1000, false);
        System.out.println("\nMotorcycle Details:");
        myMotorcycle.displayInfo();
    }
}

