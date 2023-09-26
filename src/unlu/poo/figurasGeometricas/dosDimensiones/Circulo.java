package unlu.poo.figurasGeometricas.dosDimensiones;


public class Circulo  extends FiguraDosDimensiones {
    private double radio;


    public Circulo(double radio){
        this.radio=radio;
    }
    @Override
    public double getArea() {
        return  Math.PI* Math.pow(radio,2);
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
