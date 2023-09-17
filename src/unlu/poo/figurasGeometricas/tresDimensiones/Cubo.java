package unlu.poo.figurasGeometricas.tresDimensiones;

public class Cubo extends FiguraTresDimensiones{

    private double arista;
    public Cubo(Double arista){
        this.arista=arista;
    }


    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }


    public double getArea() {
        return  6 * Math.pow(arista,2);
    }

    @Override
    public double getVolumen() {
        return Math.pow(arista,3);
    }


}
