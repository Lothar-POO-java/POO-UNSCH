package LABORATORIO02;

// Part 3: Circle Class

public class Circle {
    final double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Part 4: Utilities Class
class Utilities {
    // Static method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
