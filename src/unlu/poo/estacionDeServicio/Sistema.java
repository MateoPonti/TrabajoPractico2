package unlu.poo.estacionDeServicio;

import unlu.poo.clubFutbol.Socio;

import java.time.LocalDate;
import java.util.*;

public class Sistema {
    private ArrayList<Empleado> empleados;
    private ArrayList<Combustible> combustibles;
    private ArrayList<Expendedor> expendedores;
    private ArrayList<Cliente> clientes;

    private ArrayList<Venta> ventas;



    public Sistema() {
        empleados= new ArrayList<>();
        combustibles= new ArrayList<>();
        expendedores= new ArrayList<>();
        clientes= new ArrayList<>();
        ventas= new ArrayList<>();
    }

    public String proporcionesDeVentasPorCombustible() {
        List<String[]> proporciones = InformeVentas.proporcionesDeVentasPorCombustible(combustibles, ventas);

        StringBuilder resultado = new StringBuilder();

        resultado.append("Combustibles por proporciones de Ventas: ").append("\n");

        for (String[] proporcion : proporciones) {
            resultado.append("Nombre combustible: ").append(proporcion[0]).append(", Proporción: ").append(proporcion[1]).append("\n");
        }

        return resultado.toString();
    }

    public String surtidoresPorMontoTotalVentas() {
        List<String[]> expVentas = InformeVentas.surtidoresOrdenadosPorMontoTotalVentas(expendedores);

        StringBuilder expendedoresStr = new StringBuilder();
        expendedoresStr.append("Expendedores por Monto Total: ").append("\n");

        for (String[] exp : expVentas) {
            expendedoresStr.append("Código expendedor: ").append(exp[0]).append(", Monto Total: ").append(exp[1]).append("\n");
        }

        return expendedoresStr.toString();
    }

    public String surtidoresOrdenadosPorLitrosExpendidos() {
        List<String[]> expLitros = InformeVentas.surtidoresOrdenadosPorLitrosExpendidos(expendedores);

        StringBuilder expendedoresStr = new StringBuilder();
        expendedoresStr.append("Expendedores por litros expendidos: ").append("\n");

        for (String[] exp : expLitros) {
            expendedoresStr.append("Código expendedor: ").append(exp[0]).append(", Litros Expendidos: ").append(exp[1]).append("\n");
        }
        return expendedoresStr.toString();
    }


    public String top10ClientesPorMontoTotalCompras() {
        List<String[]> clientTop10 = InformeVentas.top10ClientesPorMontoTotalCompras(clientes);

        StringBuilder clientesTop10Str = new StringBuilder();
        clientesTop10Str.append("Top 10 Clientes Total Vendido: ").append("\n");
        for (String[] cliente : clientTop10) {
            clientesTop10Str.append("Patente Cliente : ").append(cliente[0]).append(", Total vendido: ").append(cliente[1]).append("\n");
        }
        return clientesTop10Str.toString();
    }

    public String empleadosOrdenadosPorMontoTotalVentas() {
        List<String[]> emplVentas = InformeVentas.empleadosOrdenadosPorMontoTotalVentas(empleados);

        StringBuilder expendedoresStr = new StringBuilder();

        for (String[] empl : emplVentas) {
            expendedoresStr.append("DNI empleado: ").append(empl[0]).append(", Total vendido: ").append(empl[1]).append("\n");
        }
        return expendedoresStr.toString();
    }



    public boolean agregarCliente(String pat,String nombre){
        for (Cliente c: clientes){
            if (c.compararPat(pat)){
                return false;
            }
        }
        clientes.add(new Cliente(pat,nombre));
        return true;
    }

    public String mostrarClientes(){
        StringBuilder listaClientes= new StringBuilder();
        listaClientes.append("Lista Clientes").append("\n");
        for (Cliente c:clientes){
            listaClientes.append("-").append(c).append("\n");
         }
        return listaClientes.toString();
    }

    public boolean agregarCombustible(String nombre,float precioLitro){
        for (Combustible c: combustibles){
            if (c.compararNombre(nombre)){
                return false;
            }
        }
        combustibles.add(new Combustible(nombre,precioLitro));
        return true;
    }

    public String mostrarCombustibles(){
        StringBuilder listaCombustibles= new StringBuilder();
        listaCombustibles.append("Lista Combustibles").append("\n");
        for (Combustible c:combustibles){
            listaCombustibles.append("-").append(c).append("\n");
        }
        return listaCombustibles.toString();
    }

    public boolean agregarEmpleado(String apellido,String nombre,String direccion,String telefono,String dni){
        for (Empleado e: empleados){
            if (e.compararDni(dni)){
                return false;
            }
        }
        empleados.add(new Empleado(apellido,nombre,direccion,telefono,dni));
        return true;
    }

    public String mostrarEmpleados(){
        StringBuilder listaEmpleados= new StringBuilder();
        listaEmpleados.append("Lista Empleados").append("\n");
        for (Empleado e:empleados){
            listaEmpleados.append("-").append(e).append("\n");
        }
        return listaEmpleados.toString();
    }

    public boolean agregarExpendedor(String codigoExp,String nombreCombustible){
        Combustible comb= buscarCombustible(nombreCombustible);
        if (comb==null){return  false;} // no existe ese combustible
        for (Expendedor e: expendedores){if (e.compararCod(codigoExp)){return false;}}
        Expendedor exp= new Expendedor(codigoExp);
        exp.setCombustible(comb);
        expendedores.add(exp);
        return true;
    }



    public String mostrarExpendedores(){
        StringBuilder listaExpendedores= new StringBuilder();
        listaExpendedores.append("Lista Expendedores").append("\n");
        for (Expendedor e:expendedores){
            listaExpendedores.append("-").append(e).append("\n");
        }
        return listaExpendedores.toString();
    }

    public boolean  generarVenta(String dniEmpleado,String clientePatente,String codExp, float importeTotal,boolean descuentoEmpleado){
        return  generarVenta(dniEmpleado,clientePatente,codExp,importeTotal,LocalDate.now(),descuentoEmpleado);
    }

    public boolean  generarVenta(String dniEmpleado, String clientePatente, String codExp, float importeTotal, LocalDate fecha,boolean descuentoEmpleado){
        Expendedor expendedor=buscarExpendedor(codExp);
        Empleado empleado=buscarEmpleado(dniEmpleado);
        Cliente cliente= buscarCliente(clientePatente);
        if ((cliente==null)||(empleado==null) ||(expendedor==null)){ return false;}

        if (empleado.isRealizoDescuento() && InformeVentas.estaEmpleadoTop10Ventas(empleado,ventas)){
            empleado.realizoDescuento();
            importeTotal= (float) (importeTotal*0.9);
        }
        boolean descuento = InformeVentas.clienteEstaEnTop10(cliente,clientes);
        ventas.add(new Venta(expendedor,empleado,cliente,importeTotal,fecha,descuento));
        return true;
    }









    private Combustible buscarCombustible(String nombreCombustible) {
        for (Combustible c: combustibles){if (c.compararNombre(nombreCombustible)){return c;}}
        return null;
    }

    private Cliente buscarCliente(String pat) {
        for (Cliente c: clientes){if (c.compararPat(pat)){return c;}}
        return null;
    }

    private Expendedor buscarExpendedor(String cod) {
        for (Expendedor e: expendedores){if (e.compararCod(cod)){return e;}}
        return null;
    }

    private Empleado buscarEmpleado(String dni) {
        for (Empleado e: empleados){if (e.compararDni(dni)){return e;}}
        return null;
    }

}

