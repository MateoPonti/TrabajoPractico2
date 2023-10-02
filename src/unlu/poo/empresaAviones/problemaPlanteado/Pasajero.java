package unlu.poo.empresaAviones.problemaPlanteado;

public class Pasajero extends Persona{
    private String numPasajero;
    public Pasajero(String nombre, String numeroTelefono, String direccion,String numPasajero) {
        super(nombre, numeroTelefono, direccion);
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
        return super.toString()+ ", numPasajero='" + numPasajero ;
    }
}
