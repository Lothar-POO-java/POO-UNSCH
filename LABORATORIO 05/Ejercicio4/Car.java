package Ejercicio4;

// Clase derivada Coche
class Car extends Vehicle {
    private int doors;

    // Constructor de la clase derivada Coche
    public Car(String brand, int doors) {
        super(brand); // Llama al constructor de la clase base
        this.doors = doors;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Number of doors: " + doors);
    }
}