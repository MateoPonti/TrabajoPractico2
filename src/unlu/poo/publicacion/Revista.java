package unlu.poo.publicacion;

public class Revista extends PublicacionPrestadas{
    private String ISNN;
    private String numPublicacion;

    private int cantEjemplares
    public Revista(String nombre, String editor, String telefono,int cant) {
        super(nombre, editor, telefono,cant);
    }

    public boolean prestar() {
        return false;
    }



    @Override
    public int calcularCantidadPrestamos() {
        return 0;
    }
}
