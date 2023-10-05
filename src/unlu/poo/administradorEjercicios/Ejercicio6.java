package unlu.poo.administradorEjercicios;

import unlu.poo.estacionDeServicio.Sistema;

public class Ejercicio6 {

   public Ejercicio6(){
       Sistema s=new Sistema();
       s.agregarCliente("312","juan");
       s.agregarCliente("312","Maria");
       s.agregarCliente("3212","juan");
       s.agregarCliente("3124","Pedro");
       System.out.println(s.mostrarClientes());

       s.agregarCombustible("Super",54f);
       s.agregarCombustible("Diesel 500",70.90f);
       s.agregarCombustible("Infinia",90.5f);
       System.out.println(s.mostrarCombustibles());

       s.agregarEmpleado("Ponti","Mateo","alba 3213","312312","321");
       s.agregarEmpleado("Mar","Sofia","ereq 312","31231","21");
       System.out.println(s.mostrarEmpleados());

       s.agregarExpendedor("13","Super");
       s.mostrarExpendedores();

       s.generarVenta("321","3124","13",3200,false);


       System.out.println("Se genero venta con dni empleado 321 , cliente patente 3124, codigo de expendedor 13 , importe 3200 , sin descuento empleado ");

       System.out.println("----------------------------------------------------------------------------------------------");
       System.out.println("En caso de que no se realizo ninguna venta con ese empleado , combustible , o cliente , no se muestran");
       System.out.println("----------------------------------------------------------------------------------------------");
       System.out.println(s.empleadosOrdenadosPorMontoTotalVentas());
       System.out.println("----------------------------------------------------------------------------------------------");
       System.out.println(s.surtidoresOrdenadosPorLitrosExpendidos());
       System.out.println("----------------------------------------------------------------------------------------------");
       System.out.println(s.surtidoresPorMontoTotalVentas());
       System.out.println("----------------------------------------------------------------------------------------------");
       System.out.println(s.proporcionesDeVentasPorCombustible());
       System.out.println("----------------------------------------------------------------------------------------------");
       System.out.println(s.top10ClientesPorMontoTotalCompras());





    }
}
