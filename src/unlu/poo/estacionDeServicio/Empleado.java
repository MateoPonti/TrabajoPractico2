package unlu.poo.estacionDeServicio;

import java.util.ArrayList;

public class Empleado {
    private String apellido;
    private  String nombre;
    private  String direccion;
    private String telefono;
    private String dni;

    private ArrayList<Venta> ventas;

    public Empleado(String apellido, String nombre, String direccion, String telefono, String dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        ventas=new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean compararDni(String dni) {
        return this.dni.equals(dni);
    }

    private boolean realizoDescuento = false;

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dni='" + dni ;
    }
    public float getTotalVendido() {
        float venta= 0;
        for (Venta v:ventas){
            venta= venta+v.getImporteTotal();
        }
        return venta;
    }

    public  void  agregarVenta(Venta v) {
        this.ventas.add(v);
    }

    public boolean isRealizoDescuento(){
        return realizoDescuento;
    }

    public void realizoDescuento(){
        this.realizoDescuento=true;
    }


}
