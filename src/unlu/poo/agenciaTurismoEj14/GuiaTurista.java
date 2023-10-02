package unlu.poo.agenciaTurismoEj14;

public class GuiaTurista extends Proveedor{


    public GuiaTurista(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularImporteBase() {
        return 1000;
    }

    @Override
    public double calcularValorTotal(int cantClientes) {
        if (cantClientes>200){return calcularImporteBase()+90;}
        return calcularImporteBase();
    }
    @Override
    public String toString() {
        return  "Tipo : GuiaTurista, Nombre:  "+getNombre();}
}
