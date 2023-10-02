package unlu.poo.agenciaTurismoEj14;

public class Transporte extends Proveedor{

    public Transporte(String nombreEmpresa) {
        super(nombreEmpresa);
    }

    @Override
    public double calcularImporteBase() {
        return 1500;
    }

    @Override
    public double calcularValorTotal(int cantClientes) {
        return calcularImporteBase()+ (cantClientes* (0.3*calcularImporteBase()));
    }

    @Override
    public String toString() {
        return  "Tipo : Transporte, Nombre de la Empresa:  "+getNombre();}
}
