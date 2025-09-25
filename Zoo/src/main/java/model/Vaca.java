package model;

public class Vaca extends Animal {
    public Vaca(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (Vaca): MUUUU");
    }
}
