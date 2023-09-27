package unlu.poo.renta;

public class CamionCarga extends Vehiculo{
    public CamionCarga(String patente) {
        super(patente);
    }

    private final double precioFijo=100000;

    private final int cantDiasFijos=30;




    @Override
    public double calcularAlquiler(int cantidadDias) {
        if (cantidadDias>cantDiasFijos){return precioFijo+(getPrecioBase()*(cantidadDias-cantDiasFijos));}
        return precioFijo;
    }

    @Override
    public double getPrecioBase() {
        return 75000;
    }

    @Override
    public String toString() {
        return "Camion de Carga{ "+ super.toString()+'}';
    }
}
