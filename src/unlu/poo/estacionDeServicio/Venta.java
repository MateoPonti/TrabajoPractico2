package unlu.poo.estacionDeServicio;

import java.time.LocalDate;

public class Venta {
    private Expendedor expendedor;
    private LocalDate fecha;
    private float importeTotal;

    private Empleado empleado;

    private float litrosVenta;

    private String combustibleVenta;

    public Venta(Expendedor expendedor,Empleado empleado,Cliente c, float importeTotal,boolean descuento) {
        this(expendedor,empleado,c,importeTotal,LocalDate.now(),descuento);
    }

    public Venta(Expendedor expendedor,Empleado empleado,Cliente c, float importeTotal,LocalDate fecha,boolean descuento) {
        setExpendedor(expendedor);
        setEmpleado(empleado);
        setFecha(fecha);
        setImporteTotal(importeTotal,descuento);
        setLitrosVenta(importeTotal/(expendedor.getPrecioCombustibleVenta()));
        setCombustibleVenta(expendedor.getTipoCombustible());

        expendedor.usarLitros(litrosVenta);
        expendedor.agregarVenta(this);
        empleado.agregarVenta(this);
        c.agregarVenta(this);

    }

    public void setExpendedor(Expendedor expendedor) {
        this.expendedor = expendedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setImporteTotal(float importeTotal, boolean desc) {
        if (desc) {importeTotal= (float) (importeTotal*0.95);}
        this.importeTotal=importeTotal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setLitrosVenta(float litrosVenta) {
        this.litrosVenta = litrosVenta;
    }

    public void setCombustibleVenta(String combustibleVenta) {
        this.combustibleVenta = combustibleVenta;
    }

    public float getLitrosVenta() {
        return litrosVenta;
    }

    public  String getCombustibleVenta(){
        return combustibleVenta;
    }
    public  String getExpendedor(){
        return expendedor.getCodigo();
    }

    public float getImporteTotal(){
        return importeTotal;
    }

    public boolean loVendio(String dni) {
        return empleado.compararDni(dni);
    }


    public int getMes() {
        return  fecha.getMonthValue();
    }

    public boolean mismoMes(LocalDate fecha) {
        return this.fecha.getMonth()==fecha.getMonth() && this.fecha.getYear()==fecha.getYear();
    }
}
