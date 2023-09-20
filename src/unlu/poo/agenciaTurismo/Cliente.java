package unlu.poo.agenciaTurismo;

public class Cliente {

    private String Nombre;
    private static int idNum=1;
    private int id;

    public Cliente(String nombre) {
        Nombre = nombre;
        this.id = idNum;
        idNum++;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getId() {
        return id;
    }


}
