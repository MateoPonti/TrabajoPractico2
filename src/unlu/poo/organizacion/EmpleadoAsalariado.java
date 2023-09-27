package unlu.poo.organizacion;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado{

    private int sumaFija;

    public EmpleadoAsalariado(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit,int sumaFija) {
        super(fechaCumple, nombre, apellido, telefono, cuit);
        this.sumaFija=sumaFija;
    }

    public double calcularSueldo() {
        return sumaFija;
    }

    @Override
    public double getSueldoCumple() {
        return 0;
    }

}
