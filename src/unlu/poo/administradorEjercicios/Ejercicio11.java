package unlu.poo.administradorEjercicios;

import unlu.poo.renta.Renta;

import java.time.LocalDate;

public class Ejercicio11 {
    public Ejercicio11(){
        Renta r= new Renta();

        r.agregarCliente("Juian");
        r.agregarCliente("marcelo");


        r.agregarAutoPasajero("321",2,false);
        r.agregarCamionCarga("3213");
        r.agregarCombi("3123");
        r.agregarFlete("31",50);

        r.agregarPresupuesto("31",10);
        r.agregarPresupuesto("3213",31);

        r.alquilar(3,1, LocalDate.now());
        r.alquilar(1,1, LocalDate.now());
        r.alquilar(1,2, LocalDate.now());
        r.alquilar(1,1, LocalDate.now()); // no deberia alquilar ya que el vehiculo esta en alquiler


        System.out.println(r.mostrarClientes());
        System.out.println();
        System.out.println(r.mostrarVehiculos());
        System.out.println();
        System.out.println(r.mostrarPresupuestos());
        System.out.println();
        System.out.println("Vamos a alquilar al cliente 1 el presupuesto id 1 : patente 31  flete y el presupuesto id 2 : patente 3213 camion de cargo");
        System.out.println();
        System.out.println(r.mostrarAlquilerCliente(1));
        System.out.println(r.mostrarTotalAlquiler());




    }
}
