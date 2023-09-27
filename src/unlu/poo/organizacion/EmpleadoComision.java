package unlu.poo.organizacion;

import java.time.LocalDate;

public class EmpleadoComision extends Empleado{

    private double precioVentas;
    private double porcentaje;


    public EmpleadoComision(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit,double porcentaje) {
        this(fechaCumple,nombre,apellido,telefono,cuit,0,porcentaje);
    }
    public EmpleadoComision(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit,double precioVentas,double porcentaje) {
        super(fechaCumple, nombre, apellido, telefono, cuit);
        setPorcentaje(porcentaje);
        setPrecioVentas(precioVentas);
    }

    public double getPrecioVentas() {
        return precioVentas;
    }

    public void setPrecioVentas(double precioVentas) {
        if (precioVentas>=0){
        this.precioVentas = precioVentas;}
        else {this.precioVentas=0;}
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        if (porcentaje>0){this.porcentaje = porcentaje; }
        else{this.porcentaje = 1; }
    }

    @Override
    public double calcularSueldo() {
        return (porcentaje/100)*precioVentas;
    }

    @Override
    public double getSueldoCumple() {
        return 0;
    }
}
