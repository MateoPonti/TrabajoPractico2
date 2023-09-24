package unlu.poo.academiaDanza;

import java.time.LocalDate;
import java.util.ArrayList;

public class Academia {
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Comision> comisiones;


    public Academia() {
        profesores= new ArrayList<>();
        alumnos= new ArrayList<>();
        comisiones= new ArrayList<>();
    }

    public boolean agregarProfesor(String nombre, String dni) {
        if (buscarProfesorPorDNI(dni)==null){
            this.profesores.add(new Profesor(nombre,dni));
            return true;
        };
        return false;

    }

    public boolean agregarAlumno(String nombre,String dni) {
        if (buscarAlumnoPorDNI(dni)==null){
            this.alumnos.add(new Alumno(nombre,dni));
            return true;
        };
        return false;

    }

    public void agregarCom(Disciplina disciplina, String dia, String horario, Nivel nivel) {
        this.comisiones.add( new Comision(disciplina,dia,horario,nivel));
    }


    public boolean asignarProfesorComisiones(String DniProf, int idCom){
        Profesor p=buscarProfesorPorDNI(DniProf);
        Comision c= buscarCom(idCom);
        return (p!=null) && (c!=null) && c.setProfesorACargo(p);

    }


    public String mostrarAlumnos(){
        StringBuilder al= new StringBuilder("Lista de Alumnos: " + "\n");

        for (Alumno a:alumnos){
            al.append(a).append("\n");
        }
        return al.toString();
        }
    public String mostrarProfesores(){
        StringBuilder pr= new StringBuilder("Lista de Profesores: " + "\n");

        for (Profesor p:profesores){
            pr.append(p).append("\n");
        }
        return pr.toString();
    }

    public String mostrarCom(){
        StringBuilder cm= new StringBuilder("Lista de Comisiones: " + "\n");

        for (Comision c:comisiones){
            cm.append(c).append("\n");
        }
        return cm.toString();
    }


    public String calcularInformeParticipantesProfesor(String DNIProfesor){
        Profesor p=buscarProfesorPorDNI(DNIProfesor);
        if (p!=null){
            return "Comisiones y clases del profesor "+p.getNombre()+"\n"+ p.mostrarParticipacionesMes();
        };
        return "No existe un Profesor con ese DNI";
    }


    public boolean asistirAlumno(String dniAlumno, LocalDate fechaClase, int idCom){
        Alumno alumno= buscarAlumnoPorDNI(dniAlumno);
        Comision com= buscarCom(idCom);
        return (alumno != null) && (com != null) && com.asistirAlumno(alumno, fechaClase);
    }

    public boolean agregarClase(int idCom , LocalDate clase){
        Comision com=buscarCom(idCom);
        return (com!=null) && com.agregarClase(clase);
    }



    private Comision buscarCom(int id){
        for (Comision c:comisiones){
            if (c.compararCom(id)){return c;}
        }
        return null;
    }
    private Profesor buscarProfesorPorDNI(String DNI){
        for (Profesor p:profesores){
            if (p.compararDni(DNI)){ return p;}
        }
        return null;
    }

    private Alumno buscarAlumnoPorDNI(String DNI){
        for (Alumno a:alumnos){
            if (a.compararDni(DNI)){ return a;}
        }
        return null;
    }


}
