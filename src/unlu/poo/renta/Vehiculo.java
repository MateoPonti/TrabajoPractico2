package unlu.poo.renta;

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

    public void alquilar() {
        this.alquilado = true;
    }

    public void devolver(){
        this.alquilado = false;
    }



    public boolean compararPatente(String p) {
        return p.equals(patente);
    }

    @Override
    public String toString() {
        return
                "patente='" + patente ;}
}
