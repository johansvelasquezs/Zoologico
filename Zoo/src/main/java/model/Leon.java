package model;

public class Leon extends Animal {
    public Leon(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (León): ¡Grrrr!");
    }
}
