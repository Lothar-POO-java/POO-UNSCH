package LABORATORIO04;

// Base class to represent a generic vehicle
class Vehicle {
    // Attributes common to all vehicles
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize vehicle attributes
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived class representing a motorized vehicle
class MotorizedVehicle extends Vehicle {
    // Additional attribute for motorized vehicles
    private int engineCapacity;

    // Constructor to initialize attributes of motorized vehicle
    public MotorizedVehicle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    // Method to display motorized vehicle details, including engine capacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}

// Final derived class representing a car
class Car extends MotorizedVehicle {
    // Additional attribute for cars
    private int numberOfDoors;

    // Constructor to initialize attributes of a car
    public Car(String brand, String model, int year, int engineCapacity, int numberOfDoors) {
        super(brand, model, year, engineCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details, including number of doors
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Final derived class representing a motorcycle
class Motorcycle extends MotorizedVehicle {
    // Additional attribute for motorcycles
    private boolean hasSidecar;

    // Constructor to initialize attributes of a motorcycle
    public Motorcycle(String brand, String model, int year, int engineCapacity, boolean hasSidecar) {
        super(brand, model, year, engineCapacity);
        this.hasSidecar = hasSidecar;
    }

    // Method to display motorcycle details, including if it has a sidecar
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
