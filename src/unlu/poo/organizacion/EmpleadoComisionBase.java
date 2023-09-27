package unlu.poo.organizacion;

import java.time.LocalDate;

public class EmpleadoComisionBase extends EmpleadoComision{
    private double salarioBase;

    public EmpleadoComisionBase(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit, double porcentaje, double salBase) {
        this(fechaCumple,nombre,apellido,telefono,cuit,0,porcentaje,salBase);
    }
    public EmpleadoComisionBase(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit, double precioVentas, double porcentaje, double salBase) {
        super(fechaCumple, nombre, apellido, telefono, cuit, precioVentas, porcentaje);
        this.salarioBase=salBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase+super.calcularSueldo();
    }

    @Override
    public double getSueldoCumple() {
        return super.getSueldoCumple()+1000;
    }

    @Override
    public String toString() {
        return "EmpleadoComisionBase{" +
                "atributos de empleado comision:"+"\n"+
                super.toString()+"\n"+"atributos de comision base:"+"\n"+
                "salarioBase=" + salarioBase +
                '}';
    }
}
