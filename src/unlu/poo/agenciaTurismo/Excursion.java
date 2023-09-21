package unlu.poo.agenciaTurismo;

import java.util.ArrayList;

public class Excursion {
    private String nombre;


    public Excursion(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }


    public boolean equals(Excursion exc) {
        return exc.getNombre().equals(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }


}
