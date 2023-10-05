package unlu.poo.estacionDeServicio;

public class Combustible {
    private String nombre;
    private float precioLitro;

    public Combustible(String nombre, float precioLitro) {
        this.nombre = nombre;
        this.precioLitro = precioLitro;
    }

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


    public boolean compararNombre(String nombreC) {
        return nombre.equals(nombreC);
    }

    @Override
    public String toString() {
        return
                "nombre= " + nombre + '\'' +
                ", precio por litro = " + String.valueOf(precioLitro) ;
    }
}
