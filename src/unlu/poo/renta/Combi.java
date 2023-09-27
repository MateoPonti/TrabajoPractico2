package unlu.poo.renta;

public class Combi extends Vehiculo{
    public Combi(String patente) {
        super(patente);
    }

    @Override
    public double getPrecioBase() {
        return 4500;
    }
    @Override
    public String toString() {
        return "Combi{ "+ super.toString()+'}';
    }
}
