package unlu.poo.agenciaTurismoEj14;

import java.util.ArrayList;

public class PaqueteTurismo {
    private ArrayList<Proveedor> proveedores;
    private int cantClientesMax;
    private int cantClientes=0;
    private String destino;

    private double montoTotal=0; // guarda el precio del momento en el que se creo

    private static int idTotal=1;
    private int id;

    public PaqueteTurismo(ArrayList<Proveedor> proveedores, int cantClientesMax, String destino) {
       this(proveedores,cantClientesMax,0,destino);
    }
    public PaqueteTurismo(ArrayList<Proveedor> proveedores, int cantClientesMax,int cantClientes, String destino) {
        this.proveedores = proveedores;
        this.cantClientesMax = cantClientesMax;
        this.destino = destino;
        this.cantClientes=cantClientes;
        for(Proveedor p : proveedores){
            montoTotal=montoTotal+p.calcularValorTotal(cantClientesMax);
        }
        this.id=idTotal;
        idTotal++;
    }

    public boolean agregarCliente() {
        if (cantClientes>=cantClientesMax) {return  false;}
        cantClientes++;
        return true;
    }

    public String mostrarProveedores() {
        StringBuilder proveedoresStr=new StringBuilder();
        proveedoresStr.append("Lista de Proveedores").append("\n");
        for (Proveedor p : proveedores){
            proveedoresStr.append(p).append("\n");
        }
        return proveedoresStr.toString();
    }

    @Override
    public String toString() {
        return "PaqueteTurismo{" +"\n"+
                "id="+String.valueOf(id) + "\n"+
                "Proveedores=" + "\n"+mostrarProveedores() +
                " CantClientesMax=" + String.valueOf(getCantClientesMax()) +"\n"+
                " CantClientes=" + String.valueOf(getCantClientes()) +"\n"+
                " Destino='" + getDestino() + '\'' +"\n"+
                " MontoTotal=" + String.valueOf(getMontoTotal()) +
                '}';
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public int getCantClientesMax() {
        return cantClientesMax;
    }

    public String getDestino() {
        return destino;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public double getMontoPorPersona() {
        return montoTotal/cantClientesMax;
    }

    public boolean compararId(int id){ return  id==this.id;}
}
