package unlu.poo.agenciaTurismo;

import java.util.ArrayList;

public class GuiaTurismo {


    private  ArrayList<Excursion> excursionesGuia;
    private String nombre;


    public GuiaTurismo(String nombre) {
        this.nombre = nombre;
    }


    public boolean guiaEstaExcursion(Excursion excursion){
        for (Excursion ex:excursionesGuia){
            if (ex.equals(excursion)){return true;}
        }
        return false;
    }

    public void agregarExcursion(Excursion ex){
        this.excursionesGuia.add(ex);
    }

    public String mostrarExcursion(){
        StringBuilder excursiones= new StringBuilder();
        excursiones.append("Excursion del Guia ").append(nombre).append(": ").append("\n");
        for (Excursion ex:excursionesGuia){
            excursiones.append(ex.getNombre()).append("\n");
        }
        return excursiones.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
