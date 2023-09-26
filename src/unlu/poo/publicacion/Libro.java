package unlu.poo.publicacion;

import java.util.ArrayList;

public class Libro extends PublicacionPrestadas{

    private ArrayList<Ejemplar> ejemplares;
    private String ISBN;

    private ArrayList<String> autores;

    private int id;
    private static int idTotal=1;

    public Libro(String nombre, String editor, String telefono, int cantEjemplares,String añoPub,ArrayList<String> autores) {
        this(nombre,editor,telefono,cantEjemplares,"",añoPub,autores);
    }
    public Libro(String nombre, String editor, String telefono, int cantEjemplares,String ISBN,String añPub,ArrayList<String> autores) {
        super(nombre, editor, telefono,cantEjemplares,añPub);
        this.ISBN=ISBN;
        ejemplares=new ArrayList<>();
        this.autores=autores;
        id=idTotal;
        idTotal++;
        arrancarEjemplares();

    }


    public boolean prestar(int num,Socio socio) {
        Ejemplar e=buscarEjemplar(num);
        boolean PuedoPrestar = (getNumEjemplaresDisponibles()) >1;
        return  (e!=null) && (PuedoPrestar) && (e.prestar(socio));
    }


    public boolean devolver(int num) {
        Ejemplar e=buscarEjemplar(num);
        if (e==null){return false;}
        e.devolver();
        return true;
    }

    private Ejemplar buscarEjemplar(int num) {
        for (Ejemplar e:ejemplares){
            if (e.compararNum(num)){
                return e;
            }
        }
        return null;
    }

    private void arrancarEjemplares(){
        for(int i=0;i<getCantEjemplares();i++){
            ejemplares.add(new Ejemplar(i,getNombre()));
        }
    }



    public boolean agregarEjemplar(int num){
        if (buscarEjemplar(num)!=null){
            ejemplares.add(new Ejemplar(num,getNombre()));
            return true;
        }
        return false;
    }




    @Override
    public int getCantEjemplaresPrestados() {
        int num=0;
        for(Ejemplar e: ejemplares){
            if (e.isPrestado()){ num++;}
        }
        return num;
    }

    public int getNumEjemplaresDisponibles(){
        return getCantEjemplares()-getCantEjemplaresPrestados();
    }

    public void agregarAutor(String n) {
        autores.add(n);
    }
    public String getAutores(){
        StringBuilder autoresNombres= new StringBuilder();
        for (String autor:autores){
            autoresNombres.append(autor).append("\n");
        }
        return autoresNombres.toString();
    }

    public boolean compararId(int num){
        return id==num;
    }
    @Override
    public String toString() {
        return "id: "+id+", nombre del Libro : "+getNombre()+"Num Ejemplares: "+getCantEjemplares()+", Num Ejemplares Prestado: "+getCantEjemplaresPrestados()+", Num Ejemplares Disponibles: "+getNumEjemplaresDisponibles()+"\n"+"autor/es: "+ "\n" + getAutores()+"Editor: "+getEditor()+", telefono: "+getTelefono()+", año publicacion:  "+getAñoPublicacion();
    }
}