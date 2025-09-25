package model;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private final List<Animal> animals = new ArrayList<>();

    public void registrarAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listarAnimales() {
        System.out.println("\nAnimales en el zoológico:");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public boolean actualizarAnimal(int id, String nuevoNombre, int nuevaEdad) {
        for (Animal aux : animals) {
            if (aux.getId() == id) {
                aux.actualizarDatos(nuevoNombre, nuevaEdad);
                return true;
            }
        }
        return false;
    }



    public void eliminarAnimal(int id) {
        animals.removeIf(aux -> aux.getId() == id);
    }

    public void hacerSonarTodos() {
        System.out.println("\nTodos los animales hacen sonido:");
        for (Animal aux : animals) {
            aux.hacerSonido();
        }
    }
}
