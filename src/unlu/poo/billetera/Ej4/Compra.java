package unlu.poo.billetera.Ej4;

public class Compra {
    private  boolean pagado;
    private double monto;

    private static  String id;

    private static final double costoAdicional=0.05;

    public Compra(double monto,String id) {
        this.monto=monto*costoAdicional;
        this.pagado=false;
        this.id=id;
    }

    public Compra(boolean pagado, double monto) {
        this.pagado = pagado;
        this.monto = monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public boolean pagar(double monto) {
        if ((!pagado) && (monto>=this.monto) ) {
            pagado=true;
            return true;
        }
        return false;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Compra.id = id;
    }

    @Override
    public String toString() {
        return   "id= " + String.valueOf(id) +", monto= " + String.valueOf(monto) +
                "pagado= " + String.valueOf(pagado);
    }

    public boolean esCompra(String indiceCompra) {
        return id.equals(indiceCompra);
    }
}
