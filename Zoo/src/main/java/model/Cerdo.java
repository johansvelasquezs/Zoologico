package model;

public class Cerdo extends Animal {
    public Cerdo(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (Cerdo): Oink");
    }
}
