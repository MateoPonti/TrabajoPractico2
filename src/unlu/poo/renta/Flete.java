package unlu.poo.renta;

public class Flete extends Vehiculo{
    private double pat;
    private final double patPrecio=600;
    public Flete(String patente, Double pat) {
        super(patente);
        this.pat=pat;
    }


    @Override
    public double calcularAlquiler(int cantidadDias) {
        return super.calcularAlquiler(cantidadDias)+600*pat;
    }

    @Override
    public double getPrecioBase() {
        return super.getPrecioBase();
    }

    @Override
    public String toString() {
        return "Flete{"+ super.toString()+
                " pat=" + pat +
                '}';

    }
}
