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
}
