package unlu.poo.publicacion;

public class Ejemplar {
    private int numEjemplar;
    private boolean prestado;

    private String estado;

    public Ejemplar(int numEjemplar) {
        this.numEjemplar = numEjemplar;
        this.prestado=false;
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
}
