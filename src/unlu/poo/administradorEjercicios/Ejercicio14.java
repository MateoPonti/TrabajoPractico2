package unlu.poo.administradorEjercicios;
import unlu.poo.agenciaTurismoEj14.Agencia;


public class Ejercicio14 {

    public Ejercicio14() {
        Agencia ag=new Agencia();


        ag.agregarCliente("Mateo");
        ag.agregarCliente("Juan");
        ag.agregarCliente("Pedro");
        ag.agregarCliente("Mateo Pastor");



        ag.agregarGuia("Roberto" );


        ag.agregarGuia("Daniel" );


        ag.agregarHospedaje(11,"The Plaza Hotel");
        ag.agregarHospedaje(12,"Marks");
        ag.agregarHospedaje(5,"Perzon");

        ag.agregarMedioTransporte("Avions team");
        ag.agregarMedioTransporte("Mns");



        System.out.println(ag.mostrarClientes());
        System.out.println();
        System.out.println(ag.mostrarGuias());
        System.out.println();
        System.out.println(ag.mostrarHospedaje());
        System.out.println();
        System.out.println(ag.mostrarMedios());
        System.out.println();


        ag.agregarPaqueteTurismo("New York","Avions team","The Plaza Hotel",11,"Daniel",50);
        ag.agregarPaqueteTurismo("New York","Mns","Marks",12,"Daniel",20);

        ag.agregarCompra(1,1);
        ag.agregarCompra(1,2);
        ag.agregarCompra(3,2);
        ag.agregarCompra(4,2);
        ag.agregarCompra(2,1);
        ag.agregarCompra(2,3);

        System.out.println("--------------------------------------------");
        System.out.println(ag.mostrarPaquetesDeTurismo());
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println(ag.mostrarCompras());
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Destino favorito : "+ag.mostrarDestinoFavorito());


    }
}
