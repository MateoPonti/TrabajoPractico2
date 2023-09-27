package unlu.poo.administradorEjercicios;

import unlu.poo.renta.Renta;

public class Ejercicio11 {
    public Ejercicio11(){
        Renta r= new Renta();

        r.agregarCliente("Juian");
        r.agregarCliente("marcelo");


        r.agregarAutoPasajero("321",2,false);
        r.agregarCamionCarga("3213");
        r.agregarCombi("3123");
        r.agregarAutoPasajero("31",5,false);
        r.agregarFlete("31",500);

        r.agregarPresupuesto("31",10);
        r.agregarPresupuesto("3",4);

        System.out.println(r.mostrarClientes());
        System.out.println();
        System.out.println(r.mostrarVehiculos());
        System.out.println();
        System.out.println(r.mostrarPresupuestos());



    }
}
