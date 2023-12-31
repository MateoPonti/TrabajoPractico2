package unlu.poo.agenciaTurismo;

import java.util.ArrayList;

public class GuiaTurismo {


    private  ArrayList<Excursion> excursionesGuia;
    private String nombre;


    public GuiaTurismo(String nombre) {

        this.nombre = nombre;
        excursionesGuia= new ArrayList<>();
    }


    public boolean guiaEstaExcursion(Excursion excursion){ // para saber si el guia guía esta excursion
        for (Excursion ex:excursionesGuia){
            if (ex.equals(excursion)){return true;}
        }
        return false;
    }

    public boolean guiaLasExcursiones(ArrayList<Excursion> excursiones){ // para saber si un guia guía esta excursiones
        for(Excursion e:excursiones){
            if (!guiaEstaExcursion(e)){
                return false;
            }
        }
        return true;
    }
    public void agregarExcursion(String nombre){
        this.excursionesGuia.add(new Excursion(nombre));
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
        return "Nombre = "+nombre+"\n"+mostrarExcursion();
    }

    public boolean equals(GuiaTurismo g) {
        return  nombre.equalsIgnoreCase(g.getNombre());}
}
