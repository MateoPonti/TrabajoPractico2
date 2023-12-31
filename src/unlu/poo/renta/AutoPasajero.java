package unlu.poo.renta;

public class AutoPasajero extends Vehiculo{
    private int cantidadAsientos;

    private final int plazaFija=500;
    private final int asientoPrecio=300;
    private boolean vip;


    public AutoPasajero(String patente,int asientos, boolean vip) {
        super(patente);
        setCantidadAsientos(asientos);
        setVip(vip);
    }



    @Override
    public double getPrecioBase() {
        double precio= super.getPrecioBase()+(cantidadAsientos*asientoPrecio);
        if (vip){return precio+plazaFija;}
        return precio;
    }

    @Override
    public String toString() {
        return "AutoPasajero{" +
                super.toString()+
                ", cantidadAsientos=" + cantidadAsientos +
                ", vip=" + vip +
                '}';
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        if (cantidadAsientos>0){this.cantidadAsientos = cantidadAsientos; }
        else {this.cantidadAsientos=1; }
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
