package unlu.poo.publicacion;

public class Tesis extends PublicacionSinPrestar{
    private String mesPublicacion;
    private String añoPublicacion;
    private String autor;


    public Tesis(String nombre, String editor, String telefono,String autor) {
        super(nombre, editor, telefono);
        this.autor=autor;
    }
}
