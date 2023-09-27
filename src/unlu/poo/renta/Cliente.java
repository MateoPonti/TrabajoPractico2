package unlu.poo.renta;

import java.util.ArrayList;

public class Cliente {

    private ArrayList<Alquiler> alquileres;
    private String nombre;
    private int id;
    private static  int idTotal=1;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.id=idTotal;
        alquileres=new ArrayList<>();
        idTotal++;
    }

    public boolean compararId(int num){return id==num;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", id=" + id ;
    }
}
