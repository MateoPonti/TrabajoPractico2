package unlu.poo.academiaDanza;

import java.time.LocalDate;
import java.util.ArrayList;

public class Profesor {
    private ArrayList<Comision> comisionesDadas;
    private String nombre;

    private String DNI;


    public Profesor(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        comisionesDadas=new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void agregarComision(Comision comision){
        comisionesDadas.add(comision);
    }

    public boolean compararDni(String dni){
        return getDNI().equals(dni);
    }

    public String mostrarParticipacionesMes(){
        StringBuilder participacionComision= new StringBuilder("Las asistencias del profesor en las clases de los alumnos en el mes de " + LocalDate.now().getMonth() + " de éste año:" + "\n");
        for (Comision c:comisionesDadas){
            participacionComision.append(c.obtenerParticipacionMensual()).append("\n");
        }
        return participacionComision.toString();
    };

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' + ", DNI='" + DNI ;
    }

}
