package Ejercicio1;

// Clase Triangulo que hereda de Forma
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementación del método calcularArea
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}