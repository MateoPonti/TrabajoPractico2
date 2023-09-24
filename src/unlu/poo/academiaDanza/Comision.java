package unlu.poo.academiaDanza;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Comision {

    private static int numComisiones=1;
    private int numCom;
    private ArrayList<Clase> clases;


    private Disciplina disciplina;
    private String dia;
    private String horario;
    private Nivel nivel;

    private Profesor profesorACargo;

    public Comision(Disciplina disciplina, String dia, String horario, Nivel nivel) {
        this.disciplina = disciplina;
        this.dia = dia;
        this.horario = horario;
        this.nivel = nivel;
        numCom=numComisiones;
        numComisiones++;
    }

    public Profesor getProfesorACargo() {
        return profesorACargo;
    }

    public void setProfesorACargo(Profesor profesorACargo) {
        this.profesorACargo = profesorACargo;
    }

    public boolean compararCom(int id) {
        return numCom==id;
    }


    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }


    @Override
    public String toString() {
        return "Comision de la disciplina"+getDisciplina().toString()+" del nivel "+ getNivel().toString()+ "de los dias "+getDia()+" en el horario "+getHorario();
    }

    public String obtenerParticipacionMensual(){
        String participacionComision=toString()+"\n";
        int cantPartClases=0;
        for (Clase c:clases){
            participacionComision= participacionComision+"Clase de la Fecha : "+c.getFechaClase().toString()+"\n"+"Lista de Participantes: "+"\n"+c.listaParticipantes()+"\n";
            cantPartClases=cantPartClases+c.cantidadParticipantes();
        }
        return participacionComision+"\n"+"Total de Participantes de la comision en el mes: "+cantPartClases;
    };
}
