package unlu.poo.publicacion;

public class Socio {
    private String nombre;
    private int numSocio;
    private static int numSocios=1;


    public Socio(String nombre) {
        this.nombre = nombre;
        this.numSocio=numSocios;
        numSocios++;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "id= "+String.valueOf(numSocio)+" nombre= "+nombre;
    }
}
