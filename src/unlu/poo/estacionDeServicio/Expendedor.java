package unlu.poo.estacionDeServicio;

public class Expendedor {
    private int codigo;
    private Combustible combustible;


    public Expendedor(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
}
