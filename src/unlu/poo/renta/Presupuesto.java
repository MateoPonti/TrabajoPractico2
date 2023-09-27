package unlu.poo.renta;

public class Presupuesto {
    private double monto;
    private Vehiculo vehiculo;
    private int cantDias;

    private int id;
    private static int idTotal=1;


    public Presupuesto(Vehiculo v, int cantDias){
        this.monto= v.calcularAlquiler(cantDias);
        this.vehiculo=v;
        this.cantDias=cantDias;
        id=idTotal;
        idTotal++;
    }

    @Override
    public String toString() {
        return "Presupuesto{" +
                "id=" + id +
                ", monto=" + monto +
                ", vehiculo=" + vehiculo +
                ", cantDias=" + cantDias +
                '}';
    }
    public boolean compararId(int id) {
        return this.id==id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getCantDias() {
        return cantDias;
    }

    public double getMonto() {
        return monto;
    }

    public int getId() {
        return id;
    }
}
