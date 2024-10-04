package Ejercicio1;

// Clase Cuadrado que hereda de Forma
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Implementación del método calcularArea
    @Override
    public double calculateArea() {
        return side * side;
    }
}