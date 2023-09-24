package unlu.poo.academiaDanza;

public class Alumno {
    private String nombre;
    private String DNI;


    public Alumno(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
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

    public boolean compararDni(String dni){
        return getDNI().equals(dni);
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' + ", DNI='" + DNI ;
    }
}
