package unlu.poo.empresaAviones.solucionPropuesta;


import java.util.ArrayList;

public class Vuelo {

    private int id;
    private static  int idTotal=1;
    ArrayList<Persona> miembrosVuelo;

    public Vuelo() {
        this.miembrosVuelo = new ArrayList<>();
    }
    public  void agregarMiembro(Persona miembro) {
        miembrosVuelo.add(miembro);
    }

    public String mostrarMiembros() {
        StringBuilder listaMiembros= new StringBuilder();
        listaMiembros.append("Lista Miembros").append("\n");
        for (Persona p:miembrosVuelo){
            listaMiembros.append("-").append(p).append("\n");}
        return listaMiembros.toString();
    }
    @Override
    public String toString() {
        return "Vuelo{ id = " +String.valueOf(id)+
                "\n"+"miembrosVuelo=" +"\n"+ mostrarMiembros() +
                '}';
    }
}
