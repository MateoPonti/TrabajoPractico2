package unlu.poo.publicacion;

import java.time.LocalDate;

public abstract  class PublicacionPrestadas extends Publicacion {

    public abstract int calcularCantidadPrestamos();
    private String AñoPublicacion;
    private int cantEjemplares;


    public PublicacionPrestadas(String nombre, String editor, String telefono,int cant) {
        super(nombre, editor, telefono);
        cantEjemplares=cant;
    }
    public String getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        AñoPublicacion = añoPublicacion;
    }



}
