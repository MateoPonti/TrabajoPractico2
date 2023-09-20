package unlu.poo.figurasGeometricas.dosDimensiones;


public class Cuadrado extends FiguraDosDimensiones {

    private double lado;




    public Cuadrado(double lado){
        this.lado=lado;
    }
    @Override
    public double getArea() {
        return  lado*lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
}
