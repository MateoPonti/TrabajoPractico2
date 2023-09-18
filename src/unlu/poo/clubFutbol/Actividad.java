package unlu.poo.clubFutbol;

public class Actividad {

    private Tipo suscripcionRequerida;
    private String titulo;

    public Actividad(String titulo, Tipo suscripcionRequerida) {
        this.titulo=titulo;
        this.suscripcionRequerida=suscripcionRequerida;
    }


    public Tipo getSuscripcionRequerida() {
        return suscripcionRequerida;
    }

    public void setSuscripcionRequerida(Tipo suscripcionRequerida) {
        this.suscripcionRequerida = suscripcionRequerida;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public boolean equals(Actividad act) {
        return act.getSuscripcionRequerida()==suscripcionRequerida;
    }

    public boolean compararActividad(Tipo tipo){
        return tipo.ordinal()>=suscripcionRequerida.ordinal();
    }
    @Override
    public String toString() {
        return titulo;
    }
}
