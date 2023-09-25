package unlu.poo.publicacion;

public class Tesis extends PublicacionSinPrestar{
    private String mesPublicacion;
    private String añoPublicacion;
    private String Autor;


    public Tesis(String nombre, String editor, String telefono) {
        super(nombre, editor, telefono);
    }
}
