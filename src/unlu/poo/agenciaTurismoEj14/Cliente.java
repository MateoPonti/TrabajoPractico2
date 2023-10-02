package unlu.poo.agenciaTurismoEj14;

public class Cliente {
    private String nombre;
    private int id;
    private static int idTotal=1;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.id=idTotal;
        idTotal++;
    }

    public  boolean compararId(int num){
        return id==num;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", id=" + id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}
