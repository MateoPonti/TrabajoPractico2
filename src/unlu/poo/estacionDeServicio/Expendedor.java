package unlu.poo.estacionDeServicio;

import java.util.ArrayList;

public class Expendedor {
    private String codigo;
    private Combustible combustible;

    private float litrosExpendidos;

    private ArrayList<Venta> ventas;


    public Expendedor(String codigo) {

        this.codigo = codigo;
        ventas= new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }


    public float getPrecioCombustibleVenta() {
        return this.combustible.getPrecioVenta();
    }
    public String getTipoCombustible() {
        return this.combustible.getNombre();
    }

    @Override
    public String toString() {
        return "codigo= " + codigo +
                "\n"+ "combustible= "+  combustible;
    }

    public boolean compararCod(String cod) {
        return codigo.equals(cod);
    }

    public void usarLitros(float litros) {
        this.litrosExpendidos+=litros;
    }


    public  void  agregarVenta(Venta v) {
        this.ventas.add(v);
    }
    public float getLitrosExpendidos() {
        return litrosExpendidos;
    }


    public float getTotalVendido() {
        float venta= 0;
        for (Venta v:ventas){
            venta= venta+v.getImporteTotal();
        }
        return venta;
    }
}
