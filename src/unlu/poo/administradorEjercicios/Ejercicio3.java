package unlu.poo.administradorEjercicios;

import unlu.poo.academiaDanza.Academia;
import unlu.poo.academiaDanza.Disciplina;
import unlu.poo.academiaDanza.Nivel;

import java.time.LocalDate;

public class Ejercicio3 {
    public Ejercicio3(){
        Academia a=new Academia();
        a.agregarAlumno("Mateo","4231232");
        a.agregarAlumno("Juan","123231");
        a.agregarAlumno("Pablo","13233");
        a.agregarAlumno("José","32123");

        a.agregarProfesor("Pepe","3213");
        a.agregarProfesor("Josefina","3231312");


        a.agregarCom(Disciplina.CLÁSICO,"Jueves","15:30", Nivel.INICIAL);

        System.out.println(a.mostrarProfesores());
        System.out.println();
        System.out.println(a.mostrarAlumnos());
        System.out.println();
        System.out.println(a.mostrarCom());
        System.out.println();

        LocalDate fechaClase1= LocalDate.now();
        LocalDate fechaClase2=LocalDate.now().plusDays(1);

        a.agregarClase(1, fechaClase1);
        a.agregarClase(1,fechaClase2);
        a.asignarProfesorComisiones("3213",1);
        a.asistirAlumno("123231",fechaClase1,1);
        a.asistirAlumno("32123",fechaClase1,1);
        a.asistirAlumno("123231",fechaClase2,1);
        System.out.println(a.calcularInformeParticipantesProfesor("3213"));
        System.out.println();
        System.out.println(a.disciplinaConMasClases());
    }
}
