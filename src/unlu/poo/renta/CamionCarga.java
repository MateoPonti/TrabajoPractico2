package unlu.poo.renta;

public class CamionCarga extends Vehiculo{
    public CamionCarga(String patente) {
        super(patente);
    }





    @Override
    public double calcularAlquiler(int cantidadDias) {
        if (cantidadDias>30){return 75000;}
        return 100000;
    }

    @Override
    public String toString() {
        return "Camion de Carga{ "+ super.toString()+'}';
    }
}
