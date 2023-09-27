package unlu.poo.organizacion;

import java.time.LocalDate;

public class EmpleadoHora extends Empleado{

    private double cantHoras;
    private double precioHora;

    public EmpleadoHora(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit,double cantHoras,double precioHoras) {
        super(fechaCumple, nombre, apellido, telefono, cuit);
        this.precioHora=precioHoras;
        this.cantHoras=cantHoras;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public double getSueldoCumple() {
        return 0;
    }
}
