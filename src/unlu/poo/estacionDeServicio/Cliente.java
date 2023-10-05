package unlu.poo.estacionDeServicio;

import java.util.ArrayList;

public class Cliente {
    private String patente;
    private String nombre;

    private ArrayList<Venta> ventas;


    public Cliente(String patente, String nombre) {
        this.patente = patente;
        this.nombre = nombre;
        this.ventas=new ArrayList<>();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean compararPat(String patComp) {
        return patente.equals(patComp);
    }

    @Override
    public String toString() {
        return
                "patente= " + patente + '\'' +
                ", nombre= " + nombre ;
    }

    public float getTotalVendido() {
        float venta= 0;
        for (Venta v:ventas){
            venta= venta+v.getImporteTotal();
        }
        return venta;
    }
    public  void  agregarVenta(Venta v) {
        this.ventas.add(v);
    }
}
