package unlu.poo.organizacion;

import java.time.LocalDate;

public class Pasante extends Empleado{
    public Pasante(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit) {
        super(fechaCumple, nombre, apellido, telefono, cuit);
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public double getSueldoCumple() {
        return 0;
    }

    @Override
    public String toString() {
        return  "Pasante: "+"\n"+super.toString();
    }
}
