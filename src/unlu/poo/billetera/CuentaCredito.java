package unlu.poo.billetera;

import java.util.ArrayList;

public class CuentaCredito {
    private ArrayList<Compra> compras;
    private double limiteGasto;
    private static double limiteGastoFijo; // lo utilizo para saber el limite gasto original

    public CuentaCredito(double limiteGasto) {
        this.limiteGasto = limiteGasto;
        limiteGastoFijo=limiteGasto;
        compras=new ArrayList<>();
    }

    public boolean comprar(double monto) {
        Compra nuevaCompra=new Compra(monto,String.valueOf(compras.size()));
        double montoCompra= nuevaCompra.getMonto();
        if (limiteGasto>montoCompra){
            limiteGasto-=montoCompra;
            compras.add(nuevaCompra);
             return true;
        }
        return false;
    }

    public boolean pagar(double monto, String indiceCompra){
        Compra c=buscarCompra(indiceCompra);
         if (( c!=null) && (c.pagar(monto))){
             limiteGasto+=c.getMonto();
             return true;
            }
        return false;
    }

    private Compra buscarCompra(String indiceCompra){
        for (Compra c:compras){
            if (c.esCompra(indiceCompra)){
                return c;
            }
        }
        return null;
    }

    public  double getMontoDisponible(){
        return limiteGasto;
    }
    public double getSaldoDeudor() {
        return limiteGastoFijo-limiteGasto;
    }

    public double getSaldoDeudorCompra(String indiceCompra) {
        Compra c=buscarCompra(indiceCompra);
        if (c==null) {return  -1;}
        return c.getMonto();
    }

    @Override
    public String toString() {
        return 
                "compras=" +"\n"+ mostrarCompras() +
                ", Monto Disponible= " + String.valueOf(getMontoDisponible())+", saldo deudor= "+ String.valueOf(getSaldoDeudor());
    }

    private String mostrarCompras() {
        StringBuilder resultado = new StringBuilder();
        for (Compra compra : compras) {
            resultado.append(compra.toString()).append("\n");
        }
        return resultado.toString();
    }
}
