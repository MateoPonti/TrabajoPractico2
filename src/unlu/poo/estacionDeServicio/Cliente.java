package unlu.poo.estacionDeServicio;

public class Cliente {
    private String patente;
    private String nombre;

    public Cliente(String patente, String nombre) {
        this.patente = patente;
        this.nombre = nombre;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
