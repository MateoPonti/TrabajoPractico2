package unlu.poo.empresaAviones.solucionPropuesta;

public class Pasajero extends Rol {
    private String numPasajero;
    public Pasajero(String numPasajero) {
        this.numPasajero=numPasajero;
    }

    public String getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(String numPasajero) {
        this.numPasajero = numPasajero;
    }

    @Override
    public String toString() {
        return "Pasajero , numero de pasajero: '" + numPasajero ;
    }
}
