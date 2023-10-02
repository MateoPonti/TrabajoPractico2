package unlu.poo.agenciaTurismoEj14;

public abstract class Proveedor {
    private String nombre;

    public Proveedor(String nombre) {
        setNombre(nombre);
    }

    public abstract double calcularImporteBase();

    public abstract double calcularValorTotal(int cantClientes);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }


    public boolean equals(Proveedor p) {
        return nombre.equals(p.getNombre());
    }
}
