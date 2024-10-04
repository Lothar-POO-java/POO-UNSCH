package Ejercicio3;

// Clase derivada Estudiante
class Student extends Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // Sobrescribe el método saludar para incluir el nombre del estudiante
    @Override
    public void greet() {
        System.out.println("Hello, I am " + name + ", a student.");
    }

    // Sobrecarga del método saludar para saludar a otra persona
    public void greet(String anotherPerson) {
        System.out.println("Hello " + anotherPerson + ", I am " + name + ".");
    }
}
