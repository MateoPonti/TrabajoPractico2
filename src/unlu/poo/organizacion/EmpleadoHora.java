package unlu.poo.organizacion;

import java.time.LocalDate;

public class EmpleadoHora extends Empleado{

    private double cantHoras;
    private double precioHora;

    public EmpleadoHora(LocalDate fechaCumple, String nombre, String apellido, String telefono, String cuit,double cantHoras,double precioHoras) {
        super(fechaCumple, nombre, apellido, telefono, cuit);
        setPrecioHora(precioHoras);
        setCantHoras(cantHoras);
    }

    public double getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(double cantHoras) {
        if (cantHoras>0){
        this.cantHoras = cantHoras;}
        else {
            this.cantHoras = 0;}
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        if (precioHora>0){
            this.precioHora = precioHora;}
        else {
            this.precioHora = 0;}
    }


    @Override
    public double calcularSueldo() {
       double salario=cantHoras*precioHora;
       if (cantHoras>=40){salario=salario*1.20;}
       return salario+super.calcularSueldo();
       }

    @Override
    public String toString() {
        return "EmpleadoHora{" +
                super.toString()+
                ", cantHoras=" + cantHoras +
                ", precioHora=" + precioHora +
                '}';
    }
}
