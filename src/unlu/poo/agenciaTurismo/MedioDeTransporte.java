package unlu.poo.agenciaTurismo;

public class MedioDeTransporte {
    public TipoMedio tipo;
    public String nombre;

    public MedioDeTransporte(TipoMedio tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public TipoMedio getTipo() {
        return tipo;
    }

    public void setTipo(TipoMedio tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
