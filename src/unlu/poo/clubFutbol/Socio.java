package unlu.poo.clubFutbol;

public class Socio {
    private Suscripcion suscripcion;
    private String nombre;

    public Socio(String nombre,Suscripcion suscripcion) {
        this.nombre=nombre;
        this.suscripcion=suscripcion;
    }

    @Override
    public String toString() {
        if (suscripcion==null){return this.nombre+" , Suscripcion : Nula";}
        else{return this.nombre+" , Suscripcion : "+suscripcion.toString();}
    }

    public asignarSuscripcion()

}
