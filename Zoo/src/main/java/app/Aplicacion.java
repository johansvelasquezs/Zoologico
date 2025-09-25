package app;

import model.Zoologico;
import model.Leon;
import model.Cerdo;
import model.Vaca;
import model.Gato;
import model.Perro;


public class Aplicacion {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();


        zoo.registrarAnimal(new Leon(1, "Scar", 5));
        zoo.registrarAnimal(new Cerdo(2, "Ponpon", 4));
        zoo.registrarAnimal(new Vaca(3, "Manchitas", 8));
        zoo.registrarAnimal(new Gato(4, "Sirius", 2));
        zoo.registrarAnimal(new Perro(5, "Chop", 3));

        System.out.println(" Lista inicial de animales ");
        zoo.listarAnimales();

        System.out.println("\n Sonidos de los animales ");
        zoo.hacerSonarTodos();

        zoo.eliminarAnimal(4);

        System.out.println("\n Lista después de eliminar un animal ");
        zoo.listarAnimales();
    }
}
