package unlu.poo.academiaDanza;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clase {
    private ArrayList<Alumno> participantesClase;


    private LocalDate fechaClase;


    public LocalDate getFechaClase() {
        return fechaClase;
    }

    public void setFechaClase(LocalDate fechaClase) {
        this.fechaClase = fechaClase;
    }



    public void agregarParticipante(Alumno alumno){
        participantesClase.add(alumno);
    }
    public int cantidadParticipantes(){
        return participantesClase.size();
    }

}
