package unlu.poo.publicacion;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Socio> socios;
    ArrayList<Libro> libros;
    ArrayList<Revista> revistas;
    ArrayList<Diario> diarios;
    ArrayList<Tesis> tesis;




    public Biblioteca(){

        socios=new ArrayList<>();
        libros=new ArrayList<>();
        revistas=new ArrayList<>();
        diarios=new ArrayList<>();
        tesis=new ArrayList<>();

    }

    public void agregarSocio(String nombre){
        socios.add(new Socio(nombre));
    }

    public void agregarLibro(String nombre,String editor,String telefono,int cant,String añoP,ArrayList<String> autores){
        agregarLibro(nombre,editor,telefono,cant,"",añoP,autores);
    }
    public void agregarLibro(String nombre,String editor,String telefono,int cant,String isbn,String añoP,ArrayList<String> autores){
        libros.add(new Libro(nombre,editor,telefono,cant,isbn,añoP,autores));
    }
    public void agregarRevista(String nombre,String numEjemplar, String editor, String telefono,int cant,String añoP){
        agregarRevista(nombre,numEjemplar, editor, telefono,cant,añoP);
    }
    public void agregarRevista(String nombre,String numEjemplar, String editor, String telefono,int cant,String isnn,String añoP){
        revistas.add(new Revista(nombre,numEjemplar, editor, telefono,cant,isnn,añoP));
    }

    public String mostrarLibros(){
        StringBuilder librosStr= new StringBuilder();
        for (Libro l:libros){
            librosStr.append(l).append("\n");
        }
        return librosStr.toString();
    }

    public String mostrarRevitas(){
        StringBuilder revistasStr= new StringBuilder();
        for (Revista r:revistas){
            revistasStr.append(r).append("\n");
        }
        return revistasStr.toString();
    }

    public boolean prestarLibro(int idLibro,int idSocio, int numEjemplar){
        Libro l=buscarLibro(idLibro);
        Socio s=buscarSocio(idSocio);
        return  l!=null && s!=null && l.prestar(numEjemplar,s);
    }

    private Socio buscarSocio(int n){
        for(Socio s:socios){
            if (s.compararId(n)){return s;}
        }
        return null;
    }
    private Libro buscarLibro(int n){
        for(Libro l:libros){
            if (l.compararId(n)){return l;}
        }
        return null;
    }



}
