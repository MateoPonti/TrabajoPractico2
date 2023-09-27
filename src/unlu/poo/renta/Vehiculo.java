package unlu.poo.renta;

import java.util.concurrent.TransferQueue;

public class Vehiculo {
    private String patente;
    private boolean alquilado;


    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public double calcularAlquiler(int cantidadDias){
        return getPrecioBase()*cantidadDias;
    }
    public double getPrecioBase(){
        return 3000;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public boolean alquilar(){
        if (!alquilado) {
            alquilado = true;
            return true;
        }
        return false;
    }

    public boolean devolver(){
        if (alquilado) {
            alquilado = false;
            return true;
        }
        return false;
    }



    public boolean compararPatente(String p) {
        return p.equals(patente);
    }

    @Override
    public String toString() {
        return
                "patente='" + patente ;}
}
