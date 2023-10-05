package unlu.poo.estacionDeServicio;

import java.time.LocalDate;

public class Venta {
    private Expendedor expendedor;
    private LocalDate fecha;
    private float importeTotal;

    private Empleado empleado;

    private double litrosVenta;

    private String combustibleVenta;

    public Venta(Expendedor expendedor,Empleado empleado, float importeTotal) {
        this(expendedor,empleado,importeTotal,LocalDate.now());
    }

    public Venta(Expendedor expendedor,Empleado empleado, float importeTotal,LocalDate fecha) {
        this.expendedor = expendedor;
        this.empleado=empleado;
        this.fecha = fecha;
        this.importeTotal = importeTotal;
        this.litrosVenta= importeTotal/(expendedor.getPrecioCombustibleVenta());
        this.combustibleVenta=expendedor.getTipoCombustible(); // por las dudas que cambie el tipo de combustible en ese expendedor , lo guardo
    }


    public double getLitrosVenta() {
        return litrosVenta;
    }

    public  String getCombustibleVenta(){
        return combustibleVenta;
    }

    public float getImporteTotal(){
        return importeTotal;
    }

    public boolean loVendio(String dni) {
        return empleado.compararDni(dni);
    }
}
