package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Parte 01: Clases Abstractas
        Shape triangle = new Triangle(5, 10);
        Shape square = new Square(4);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
    }
}


// VELARDE YLLISCA JHON EYMER      27222126