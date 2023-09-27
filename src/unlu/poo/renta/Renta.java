package unlu.poo.renta;


import java.util.ArrayList;

public class Renta {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Presupuesto> presupuestos;


    public Renta(){
        vehiculos=new ArrayList<>();
        clientes=new ArrayList<>();
        presupuestos=new ArrayList<>();
    }

    public boolean agregarAutoPasajero(String pate,int asientos,boolean vip){
        Vehiculo v=buscarVehiculo(pate);
        if (v!=null){ return false;}
        AutoPasajero a= new AutoPasajero(pate,asientos,vip);
        vehiculos.add(a);
        return true;
    }

    public boolean agregarCamionCarga(String pate){
        Vehiculo v=buscarVehiculo(pate);
        if (v!=null){ return false;}
        CamionCarga c= new CamionCarga(pate);
        vehiculos.add(c);
        return true;
    }

    public boolean agregarFlete(String pate,double pat){
        Vehiculo v=buscarVehiculo(pate);
        if (v!=null){ return false;}
        Flete f= new Flete(pate,pat);
        vehiculos.add(f);
        return true;
    }

    public boolean agregarCombi(String pate){
        Vehiculo v=buscarVehiculo(pate);
        if (v!=null){ return false;}
        Combi c= new Combi(pate);
        vehiculos.add(c);
        return true;
    }

    public String mostrarVehiculos(){
        StringBuilder mostrarVehiculosStr= new StringBuilder();
        mostrarVehiculosStr.append("Lista de Vehiculos").append("\n");
        for (Vehiculo v:vehiculos){
            mostrarVehiculosStr.append(v).append("\n");
        }
        return mostrarVehiculosStr.toString();
    }

    public void agregarCliente(String nombre){
        clientes.add(new Cliente(nombre));
    }

    public String mostrarClientes(){
        StringBuilder mostrarClientesStr= new StringBuilder();
        mostrarClientesStr.append("Lista de Clientes").append("\n");
        for (Cliente c:clientes){
            mostrarClientesStr.append(c).append("\n");
        }
        return mostrarClientesStr.toString();
    }


    public boolean agregarPresupuesto(String patente, int cantDias){
        Vehiculo v=buscarVehiculo(patente);
        if (v==null || cantDias<=0){ return false;}
        presupuestos.add(new Presupuesto(v,cantDias));
        return true;
    }

    public String mostrarPresupuestos(){
        StringBuilder mostrarPresupuestosStr= new StringBuilder();
        mostrarPresupuestosStr.append("Lista de Presupuestos").append("\n");
        for (Presupuesto p:presupuestos){
            mostrarPresupuestosStr.append(p).append("\n");
        }
        return mostrarPresupuestosStr.toString();
    }

    private Vehiculo buscarVehiculo(String pat){
        for(Vehiculo v:vehiculos){
            if (v.compararPatente(pat)){return v;}
        }
        return null;
    }

    private Cliente buscarCliente(int id){
        for(Cliente c:clientes){
            if (c.compararId(id)){return c;}
        }
        return null;
    }
}
