package unlu.poo.academiaDanza;

import java.time.LocalDate;
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
        clases=new ArrayList<>();
        numCom=numComisiones;
        numComisiones++;
    }

    public Profesor getProfesorACargo() {
        return profesorACargo;
    }

    public boolean setProfesorACargo(Profesor profesorACargo) {
        this.profesorACargo = profesorACargo;
        profesorACargo.agregarComision(this);
        return true;
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
        return "numero de comision "+numCom+", Comision de la disciplina "+getDisciplina().toString()+" del nivel "+ getNivel().toString()+ " de los dias "+getDia()+" en el horario "+getHorario();
    }

    public String obtenerParticipacionMensual(){
        StringBuilder participacionComision= new StringBuilder(toString() + "\n");
        int cantPartClases=0;
        LocalDate fechaHoy=LocalDate.now();
        for (Clase c:clases){
            if (c.mismoMesAño(fechaHoy)){
            participacionComision.append("Clase de la Fecha : ").append(c.getFechaClase().toString()).append("\n").append("Lista de Participantes: ").append("\n").append(c.listaParticipantes()).append("\n");
            cantPartClases=cantPartClases+c.cantidadParticipantes(); }

        }
        return participacionComision.toString()+"Total de Participantes de la comision "+String.valueOf(numCom)+" en el mes: "+String.valueOf(cantPartClases)+"\n"+"\n"+"\n";
    };

    public int cantidadParticipacionMensual(){
        int cantPartClases=0;
        LocalDate fechaHoy=LocalDate.now();
        for (Clase c:clases){
            if (c.mismoMesAño(fechaHoy)){
                cantPartClases=cantPartClases+c.cantidadParticipantes(); }
        }
        return cantPartClases;
    };



    public boolean asistirAlumno(Alumno alumno, LocalDate fechaClase) {
        Clase clase = buscarClase(fechaClase);
        if (clase!=null){
        clase.agregarParticipante(alumno);
        return true;
        }
        return false;
    }

    private Clase buscarClase(LocalDate fecha){
        for (Clase c:clases){
            if (c.mismoDiaAñoMes(fecha)){
                return c;
            }
        }
        return null;
    }

    public boolean agregarClase(LocalDate fecha){
        Clase c=buscarClase(fecha);
        if (c==null){
            clases.add(new Clase(fecha));
            return true;
        }

        return false;
    }
}
