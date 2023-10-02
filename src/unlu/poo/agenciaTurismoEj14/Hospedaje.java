package unlu.poo.agenciaTurismoEj14;

public class Hospedaje extends Proveedor{
    private int cantidadMinimCliente;


    public Hospedaje(int cantidadMinimCliente,String nombre) {
        super(nombre);
        this.cantidadMinimCliente = cantidadMinimCliente;
    }

    public int getCantidadMinimCliente() {
        return cantidadMinimCliente;
    }

    public void setCantidadMinimCliente(int cantidadMinimCliente) {
        this.cantidadMinimCliente = cantidadMinimCliente;
    }

    @Override


    public double calcularImporteBase() {
        return 1000;
    }

    @Override
    public double calcularValorTotal(int cantClientes) {
        if (cantClientes>cantidadMinimCliente){
            return calcularImporteBase()- ( calcularImporteBase()*  ((cantClientes-cantidadMinimCliente)*0.5));
        }
        return calcularImporteBase();
    }

    @Override
    public String toString() {
        return  "Tipo : Hospedaje, Nombre de la Empresa:  "+getNombre()+ " , cantidad minima de clientes: "+String.valueOf(getCantidadMinimCliente());}


    public boolean equals(Hospedaje p) {
        return super.equals(p) && cantidadMinimCliente==p.cantidadMinimCliente;
    }
}
