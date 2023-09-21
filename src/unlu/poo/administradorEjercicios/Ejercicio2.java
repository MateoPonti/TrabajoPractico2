package unlu.poo.administradorEjercicios;

import unlu.poo.agenciaTurismo.Agencia;
import unlu.poo.agenciaTurismo.Cliente;
import unlu.poo.agenciaTurismo.TipoHospedaje;
import unlu.poo.agenciaTurismo.TipoMedio;

import java.util.ArrayList;

public class Ejercicio2 {
    public Ejercicio2() {
        Agencia ag= new Agencia();


        ag.agregarCliente("Mateo");
        ag.agregarCliente("Juan");
        ag.agregarCliente("Pedro");
        ag.agregarCliente("Mateo Pastor");

        ag.agregarExcursion("Senderismo en las montañas");
        ag.agregarExcursion("Excursión a una cascada");
        ag.agregarExcursion("Visita a un parque nacional");
        ag.agregarExcursion("Viaje a la playa");
        ag.agregarExcursion("Tour en kayak");
        ag.agregarExcursion("Excursion cultural");
        ag.agregarExcursion("Recorrido gastronomico");
        ag.agregarExcursion("Observacion de aves");
        ag.agregarExcursion("Camping");
        ag.agregarExcursion("Excursión en bicicleta");
        ag.agregarExcursion("Viaje a la playa");
        ag.agregarExcursion("Excursión cultural");


        ArrayList<String> listaExcursiones = new ArrayList<String>();

        listaExcursiones.add("Senderismo en las montañas");
        listaExcursiones.add("Excursión a una cascada");
        listaExcursiones.add("Visita a un parque nacional");

        ag.agregarGuia("Roberto", listaExcursiones );

        listaExcursiones = new ArrayList<String>();
        listaExcursiones.add("Excursión en bicicleta");
        listaExcursiones.add("Viaje a la playa");
        listaExcursiones.add("Excursión cultural");

        ag.agregarGuia("Daniel", listaExcursiones );


        ag.agregarHospedaje("The Plaza Hotel", TipoHospedaje.HOTEL);
        ag.agregarHospedaje("Marks",TipoHospedaje.HOSTERIA);
        ag.agregarHospedaje("Perzon",TipoHospedaje.BUNGALO);

        ag.agregarMedioTransporte("Avions team", TipoMedio.AEREA);



        //System.out.println(ag.mostrarClientes());
        //System.out.println(ag.mostrarGuias());
        //System.out.println(ag.mostrarExcursiones());
        //System.out.println(ag.mostrarHospedaje());
        //System.out.println(ag.mostrarMedios());
        ag.agregarPaqueteTurismo("New York","Avions team",TipoMedio.AEREA,listaExcursiones,"The Plaza Hotel",TipoHospedaje.HOTEL,"Daniel");


        ag.agregarCompra(1,1);
        ag.agregarCompra(1,1);
        ag.agregarCompra(2,1);

        System.out.println(ag.mostrarCompras());
        System.out.println(ag.mostrarDestinoFavorito());


        }
}
