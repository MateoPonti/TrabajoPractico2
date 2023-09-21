package unlu.poo.agenciaTurismo;

public class Excursion {
    private String nombre;


    public Excursion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean equals(Excursion exc) {
        return exc.getNombre().equals(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
