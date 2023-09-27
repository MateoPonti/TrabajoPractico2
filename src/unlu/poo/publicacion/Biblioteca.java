package unlu.poo.publicacion;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Socio> socios;
    ArrayList<Libro> libros;
    ArrayList<Revista> revistas;
    ArrayList<Diario> diarios;
    ArrayList<Tesis> tesis;

    // Solo se implemento lo necesario para prestar una libro o una revista.
    // se podria tener un array List de <Publicacion> en este ejemplo
    // no fui por ese camino ya que me lo impediria a la hora de prestar un libro o revista(estos ambos difieren tambien en el argumento a pasar para prestar , uno pasas num ejemplar y otro cantidad) ,
    // aunque a la hora de mostrar tranquilamente si se podria.


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
    public String mostrarSocios(){
        StringBuilder mostrarSociosStr= new StringBuilder();
        mostrarSociosStr.append("Lista de socios").append("\n");
        for (Socio s:socios){
            mostrarSociosStr.append(s).append("\n");
        }
        return mostrarSociosStr.toString();
    }

    public void agregarLibro(String nombre,String editor,String telefono,int cant,String añoP,ArrayList<String> autores){
        agregarLibro(nombre,editor,telefono,cant,"",añoP,autores);
    }
    public void agregarLibro(String nombre,String editor,String telefono,int cant,String isbn,String añoP,ArrayList<String> autores){
        libros.add(new Libro(nombre,editor,telefono,cant,isbn,añoP,autores));
    }
    public void agregarRevista(String nombre,String numPubli, String editor, String telefono,int cant,String añoP){
        agregarRevista(nombre,numPubli, editor, telefono,cant,"",añoP);
    }
    public void agregarRevista(String nombre,String numPubli, String editor, String telefono,int cant,String isnn,String añoP){
        revistas.add(new Revista(nombre,numPubli, editor, telefono,cant,isnn,añoP));
    }

    public String mostrarLibros(){
        StringBuilder librosStr= new StringBuilder();
        librosStr.append("Lista de Libros").append("\n");
        for (Libro l:libros){
            librosStr.append(l).append("\n");
        }
        return librosStr.toString();
    }

    public String mostrarRevistas(){
        StringBuilder revistasStr= new StringBuilder();
        revistasStr.append("Lista de Revistas").append("\n");
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
    public boolean prestarRevista(int idRevista,int cant){
        Revista r=buscarRevista(idRevista);
        return r!=null && r.prestar(cant);
    }

    public boolean devolverLibro(int idLibro, int numEjemplar){
        Libro l=buscarLibro(idLibro);
        return  l!=null && l.devolver(numEjemplar);
    }

    public boolean devolverRevista(int idRevista,int cant){
        Revista r=buscarRevista(idRevista);
        return r!=null && r.devolver(cant);
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

    private Revista buscarRevista(int n){
        for(Revista r:revistas){
            if (r.compararId(n)){return r;}
        }
        return null;
    }



}
