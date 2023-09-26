package unlu.poo.publicacion;

import java.util.ArrayList;

public class Ejemplar {
    private int numEjemplar;
    private boolean prestado;

    private String libro;
    private String estado;

    private ArrayList<Prestamo> prestamos;


    public Ejemplar(int numEjemplar,String libro) {
        this.numEjemplar = numEjemplar;
        this.prestado=false;
        this.libro=libro;
        this.prestamos=new ArrayList<>();
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public int getNumEjemplar() {
        return numEjemplar;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean compararNum(int num){
        return numEjemplar==num;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public boolean prestar(Socio socio) {
        if (prestado){return  false;} // no presta algo que ya esta prestado
        this.prestamos.add(new Prestamo(socio,this));
        prestado=true;
        return true;
    }

    public void devolver() {
        this.prestado=false;
    }
}
