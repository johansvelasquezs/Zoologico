package model;

public class Gato extends Animal {
    public Gato(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (Gato): Miau");
    }
}
