package unlu.poo.administradorEjercicios;

import unlu.poo.empresaAviones.problemaPlanteado.Pasajero;
import unlu.poo.empresaAviones.problemaPlanteado.Persona;
import unlu.poo.empresaAviones.problemaPlanteado.Tripulante;
import unlu.poo.empresaAviones.problemaPlanteado.Vuelo;

public class Ejercicio13 {
    public  Ejercicio13(){

        Vuelo vuelo= new Vuelo();
        System.out.println("Planteemos el problema ");
        Persona personaTripulante= new Tripulante("Juan","123123","alpara 231","Piloto");
        System.out.println("Tenemos al tripulante: "+personaTripulante);
        System.out.println("Si quisieramos agregar a este tripulante a un vuelo de forma de pasajero no se podria, ya que un ticket tiene un pasajero y Tripulante no es un pasajero, por lo tanto deberiamos crear una clase Pasajero con los mismos datos que tiene la instancia del tripulante esto que se instancia 2 veces la persona.");
        Persona personaPasajero=new Pasajero("Juan","123123","alpara 231","32");
        System.out.println(personaPasajero);

        System.out.println("-----------------------------------------------------");
        System.out.println("Solucion:");
        unlu.poo.empresaAviones.solucionPropuesta.Vuelo vueloSolucion= new unlu.poo.empresaAviones.solucionPropuesta.Vuelo();
        unlu.poo.empresaAviones.solucionPropuesta.Persona personaSol= new unlu.poo.empresaAviones.solucionPropuesta.Persona("Juan","123123","alpara 231");
        System.out.println("Persona es: "+personaSol);
        System.out.println("Ahora le asigno a la persona el rol de Tripulante");
        personaSol.agregarRol(new unlu.poo.empresaAviones.solucionPropuesta.Tripulante("Piloto"));
        System.out.println(personaSol);
        System.out.println("ahora le asigno su rol de pasajero con un numero de pasajero 25");
        personaSol.agregarRol(new unlu.poo.empresaAviones.solucionPropuesta.Pasajero("25"));
        System.out.println(personaSol);
        System.out.println();
        System.out.println("Por lo tanto no se tuvo que instanciar 2 veces la persona");
    }
}
