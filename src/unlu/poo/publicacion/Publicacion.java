package unlu.poo.publicacion;

public abstract  class Publicacion {
   private String nombre;
   private String editor;
   private String telefono;


    public Publicacion(String nombre, String editor, String telefono) {
        this.nombre = nombre;
        this.editor = editor;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
