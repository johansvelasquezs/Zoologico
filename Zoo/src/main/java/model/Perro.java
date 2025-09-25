package model;

public class Perro extends Animal {
    public Perro(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (Perro): Guau");
    }
}
