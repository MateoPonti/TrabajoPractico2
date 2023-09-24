package unlu.poo.academiaDanza;

import java.util.ArrayList;

public class Academia {
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Comision> comisiones;




    public boolean setProfesorACargo(String nombre,String dni) {
        if (buscarProfesorPorDNI(dni)==null){
            this.profesores.add(new Profesor(nombre,dni));
            return true;
        };
        return false;

    }

    public String calcularInformeParticipantesProfesor(String DNIProfesor){
        ;
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
