package unlu.poo.publicacion;

public class Revista extends PublicacionPrestadas{
    private String ISNN;
    private String numPublicacion;

    public Revista(String nombre, String editor, String telefono) {
        super(nombre, editor, telefono);
    }

    @Override
    public void Prestar() {

    }

    @Override
    public int calcularCantidadPrestamos() {
        return 0;
    }
}
