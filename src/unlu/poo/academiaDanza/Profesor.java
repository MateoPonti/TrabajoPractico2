package unlu.poo.academiaDanza;

import java.util.ArrayList;

public class Profesor {
    private ArrayList<Comision> comisionesDadas;
    private String nombre;

    private String DNI;


    public Profesor(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void agregarComision(Comision comision){
        comisionesDadas.add(comision);
    }

    public boolean compararDni(String dni){
        return getDNI().equals(dni);
    }

}
