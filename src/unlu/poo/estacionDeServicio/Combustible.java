package unlu.poo.estacionDeServicio;

public class Combustible {
    private String nombre;
    private float precioLitro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioVenta() {
        return precioLitro;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioLitro = precioVenta;
    }
}
