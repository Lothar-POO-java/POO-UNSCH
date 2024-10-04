package Ejercicio2;

// Clase Avion que implementa la interfaz Movible
class Plane implements Movable {
    @Override
    public void move() {
        System.out.println("The plane moves through the air.");
    }
}