package unlu.poo.administradorEjercicios;

import unlu.poo.publicacion.Biblioteca;

import java.util.ArrayList;

public class Ejercicio8 {
    public Ejercicio8(){
        Biblioteca b=new Biblioteca();
        ArrayList<String> autores= new ArrayList<>();
        autores.add("Juan Del Mercionero");
        autores.add("Maria Paz");

        b.agregarLibro("Par","juaniser","21323",3,"321",autores);
        b.agregarSocio("Juan");

        System.out.println(b.mostrarLibros());

        System.out.println("-----Presto 3 ejemplares del libro con id 1 al socio 1 , solo deberia dejarme 2 ya que 1 lo debe tener la biblioteca");
        b.prestarLibro(1,1,1);
        b.prestarLibro(1,1,2);
        b.prestarLibro(1,1,3);

        System.out.println();
        System.out.println(b.mostrarLibros());

    }
}
