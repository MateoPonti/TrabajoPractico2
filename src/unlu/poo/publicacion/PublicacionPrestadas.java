package unlu.poo.publicacion;

import java.time.LocalDate;

public abstract  class PublicacionPrestadas extends Publicacion {

    public abstract int calcularCantidadPrestamos();
    private String AñoPublicacion;


    public PublicacionPrestadas(String nombre, String editor, String telefono) {
        super(nombre, editor, telefono);
    }
    public String getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        AñoPublicacion = añoPublicacion;
    }

    public abstract void Prestar();
}
