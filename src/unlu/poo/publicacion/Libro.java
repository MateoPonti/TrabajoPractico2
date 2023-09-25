package unlu.poo.publicacion;

public class Libro extends PublicacionPrestadas{

    private String ISBN;

    public Libro(String nombre, String editor, String telefono) {
        super(nombre, editor, telefono);
    }


    @Override
    public int calcularCantidadPrestamos() {
        return 0;
    }
}