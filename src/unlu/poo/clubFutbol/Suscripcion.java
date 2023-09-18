package unlu.poo.clubFutbol;

public class Suscripcion {
    public Tipo getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    private Tipo tipo;

    private int precio;


    public Suscripcion(Tipo tipo){
        this.tipo=tipo;
    }



    public void cambiarSuscripcion(Tipo tipo){
        this.tipo=tipo;
        asignarValores();
    }
    

    private void asignarValores(){
        precio=700;
        if (tipo==Tipo.INTERMEDIA){precio=1000;}
        if (tipo==Tipo.DESTACADA){precio=1500;}

    }

    public boolean comparar(Tipo tipoSuscripcion){
        return tipo==tipoSuscripcion;
    }

}
