package unlu.poo.academiaDanza;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clase {
    private ArrayList<Alumno> participantesClase;


    private LocalDate fechaClase;


    public Clase(LocalDate fechaClase) {
        this.fechaClase = fechaClase;
        participantesClase=new ArrayList<>();
    }

    public LocalDate getFechaClase() {
        return fechaClase;
    }

    public void setFechaClase(LocalDate fechaClase) {
        this.fechaClase = fechaClase;
    }



    public void agregarParticipante(Alumno alumno){
        if (!buscarParticipante(alumno)){
        participantesClase.add(alumno);
        }
    }
    public int cantidadParticipantes(){
        return participantesClase.size();
    }

    public String listaParticipantes(){
        StringBuilder participantesClase= new StringBuilder();
        for(Alumno a:this.participantesClase){
            participantesClase.append(a.toString()).append("\n");
        }
        return participantesClase.toString();

    }

    public boolean mismoMesAño(LocalDate fecha){
        return fecha.getYear()==getFechaClase().getYear() && fecha.getMonth()==getFechaClase().getMonth();
    }

    public boolean mismoDiaAñoMes(LocalDate fecha){
        return fecha==fechaClase;
    }

    private boolean buscarParticipante(Alumno al){
        for (Alumno a:participantesClase){
            if (a.compararDni(al)){return true;}
        }
        return false;
    }
}
