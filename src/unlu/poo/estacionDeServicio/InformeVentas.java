package unlu.poo.estacionDeServicio;

import java.time.LocalDate;
import java.util.*;

public class InformeVentas {

    public static List<String[]> proporcionesDeVentasPorCombustible(ArrayList<Combustible> listaDeCombustibles, ArrayList<Venta> listaDeVentas) {
        HashMap<String, Integer> ventasPorCombustible = new HashMap<>();
        // Inicializa el HashMap con los tipos de combustible y ventas en 0.
        for (Combustible combustible : listaDeCombustibles) {
            ventasPorCombustible.put(combustible.getNombre(), 0);
        }

        // Calcula la cantidad de ventas por tipo de combustible.
        for (Venta venta : listaDeVentas) {
            String codigoCombustible = venta.getCombustibleVenta();
            int cantidadVentas = ventasPorCombustible.get(codigoCombustible);
            ventasPorCombustible.put(codigoCombustible, cantidadVentas + 1);
        }

        List<String[]> resultados = new ArrayList<>();

        // Calcula la proporción de ventas para cada tipo de combustible y almacena los resultados en la lista.
        for (String codigo : ventasPorCombustible.keySet()) {
            int cantidadVentas = ventasPorCombustible.get(codigo);
            float proporción;
            if (cantidadVentas>0){proporción = (float) cantidadVentas / listaDeVentas.size(); }
            else{proporción = 0; }
            resultados.add(new String[]{"Combustible: " + codigo, "Proporción de ventas: " + String.valueOf(proporción)});
        }
        return resultados;
    }

    public static List<String[]>surtidoresOrdenadosPorMontoTotalVentas(ArrayList<Expendedor> expendedores) {
        // Crear una lista para almacenar los resultados como pares de nombre y monto total de ventas
        List<String[]> resultados = new ArrayList<>();

        // Ordenar los expendedores por monto total de ventas
        Collections.sort(expendedores, new Comparator<Expendedor>() {
            @Override
            public int compare(Expendedor e1, Expendedor e2) {
                float montoTotalE1 = e1.getTotalVendido();
                float montoTotalE2 = e2.getTotalVendido();
                return Float.compare(montoTotalE2, montoTotalE1); // Orden descendente
            }
        });

        // Agregar los resultados a la lista
        for (Expendedor expendedor : expendedores) {
            String[] resultado = new String[]{expendedor.getCodigo(), String.valueOf(expendedor.getTotalVendido())};
            resultados.add(resultado);
        }

        return resultados;
    }

    public static List<String[]> surtidoresOrdenadosPorLitrosExpendidos(ArrayList<Expendedor> listaExpendedores) {
        // Ordenar los surtidores por cantidad de litros expendidos
        Collections.sort(listaExpendedores, new Comparator<Expendedor>() {
            @Override
            public int compare(Expendedor s1, Expendedor s2) {
                float litrosExpendidosS1 = s1.getLitrosExpendidos();
                float litrosExpendidosS2 = s2.getLitrosExpendidos();
                return Float.compare(litrosExpendidosS2, litrosExpendidosS1); // Orden descendente
            }
        });

        List<String[]> resultados = new ArrayList<>();

        // Construir la lista de resultados como pares de nombre y cantidad de litros expendidos
        for (Expendedor expendedor : listaExpendedores) {
            String[] resultado = new String[]{expendedor.getCodigo(), String.valueOf(expendedor.getLitrosExpendidos())};
            resultados.add(resultado);
        }
        return resultados;
    }



    public static List<String[]> empleadosOrdenadosPorMontoTotalVentas(ArrayList<Empleado> listaDeEmpleados) {
        // Ordenar los empleados por monto total de ventas
        Collections.sort(listaDeEmpleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado e1, Empleado e2) {
                float montoTotalE1 = e1.getTotalVendido();
                float montoTotalE2 = e2.getTotalVendido();
                return Float.compare(montoTotalE2, montoTotalE1); // Orden descendente
            }
        });

        List<String[]> resultados = new ArrayList<>();

        // Construir la lista de resultados como pares de nombre de empleado y monto total de ventas
        for (Empleado empleado : listaDeEmpleados) {
            String[] resultado = new String[]{empleado.getDni(), String.valueOf(empleado.getTotalVendido())};
            resultados.add(resultado);
        }

        return resultados;
    }



    public static  List<String[]> top10ClientesPorMontoTotalCompras(ArrayList<Cliente> listaDeClientes) {
        // Ordenar los clientes por monto total de compras
        Collections.sort(listaDeClientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                float montoTotalC1 = c1.getTotalVendido();
                float montoTotalC2 = c2.getTotalVendido();
                return Float.compare(montoTotalC2, montoTotalC1); // Orden descendente
            }
        });

        List<String[]> resultados = new ArrayList<>();

        // Limitar la lista a los 10 mejores clientes
        int limite = Math.min(10, listaDeClientes.size());

        // Construir la lista de resultados como pares de nombre de cliente y monto total de compras
        for (int i = 0; i < limite; i++) {
            Cliente cliente = listaDeClientes.get(i);
            String[] resultado = new String[]{cliente.getPatente(), String.valueOf(cliente.getTotalVendido())};
            resultados.add(resultado);
        }

        return resultados;
    }


    public static boolean clienteEstaEnTop10(Cliente cliente, ArrayList<Cliente> listaDeClientes) {
        // Obtener el top 10 de clientes por monto total de compras
        List<String[]> top10Clientes = top10ClientesPorMontoTotalCompras(listaDeClientes);

        // Buscar al cliente en el top 10
        for (String[] clienteInfo : top10Clientes) {
            String nombreCliente = clienteInfo[0];
            if (nombreCliente.equals(cliente.getNombre())) {
                return true; // El cliente está en el top 10
            }
        }

        return false; // El cliente no está en el top 10
    }

    public static void ordenarVentasPorMesYTotal(ArrayList<Venta> listaDeVentas) {
        // Define un comparador personalizado
        Comparator<Venta> comparadorVentas = new Comparator<Venta>() {
            @Override
            public int compare(Venta venta1, Venta venta2) {
                // Compara primero por mes
                int comparacionPorMes = Integer.compare(venta1.getMes(), venta2.getMes());

                if (comparacionPorMes != 0) {
                    return comparacionPorMes; // Si son meses diferentes, ordena por mes
                } else {
                    // Si son del mismo mes, ordena por monto total
                    float montoTotal1 = venta1.getImporteTotal();
                    float montoTotal2 = venta2.getImporteTotal();
                    return Float.compare(montoTotal1, montoTotal2);
                }
            }};}

    public static  boolean estaEmpleadoTop10Ventas(Empleado e, ArrayList<Venta> ventas){
        LocalDate fecha= LocalDate.now();
        int i =0;
        while(i<ventas.size() && ventas.get(i).mismoMes(fecha) && i<10){
            if (ventas.get(i).loVendio(e.getDni())){return true;}
            i++;
        }
        return false;
    }




}
