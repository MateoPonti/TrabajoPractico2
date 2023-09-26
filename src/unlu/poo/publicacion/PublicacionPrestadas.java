package unlu.poo.publicacion;

import java.time.LocalDate;

public abstract  class PublicacionPrestadas extends Publicacion {

    private String añoPublicacion;
    private int cantEjemplares;




    public PublicacionPrestadas(String nombre, String editor, String telefono,int cant,String añoP) {
        super(nombre, editor, telefono);
        cantEjemplares=cant;
        añoPublicacion=añoP;
    }
    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public boolean setCantEjemplares(int cantEjemplares) {
        if (cantEjemplares >0) {
            this.cantEjemplares = cantEjemplares;
            return true;
        }
        cantEjemplares=1;
        return false;

    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public abstract int getCantEjemplaresPrestados();
}
