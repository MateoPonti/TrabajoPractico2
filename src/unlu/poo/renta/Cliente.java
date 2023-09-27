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

    public void agregarAlquiler(Alquiler alquiler){
        this.alquileres.add(alquiler);
    }

    public String mostrarAlquileres(){
        StringBuilder mostrarAlquileresStr= new StringBuilder();
        mostrarAlquileresStr.append("Lista de Alquileres del cliente: ").append(String.valueOf(id)).append("\n");
        for (Alquiler a:alquileres){
            mostrarAlquileresStr.append(a).append("\n");
        }
        return mostrarAlquileresStr.toString();
    }

    public double obtenerMontoAlquileres(){
        double monto=0;
        for (Alquiler a:alquileres){
           monto=monto+a.getMonto();
        }
        return monto;
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
