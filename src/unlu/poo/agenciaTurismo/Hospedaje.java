package unlu.poo.agenciaTurismo;


public class Hospedaje {
    private String nombre;
    private TipoHospedaje tipo;

    public Hospedaje(String nombre, TipoHospedaje tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoHospedaje getTipo() {
        return tipo;
    }

    public void setTipo(TipoHospedaje tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "nombre: "+getNombre()+", Tipo: "+getTipo().toString();
    }

    public boolean equals(Hospedaje hd) {
        return hd.getTipo()==tipo  && hd.getNombre().equals(nombre);
    }
}
