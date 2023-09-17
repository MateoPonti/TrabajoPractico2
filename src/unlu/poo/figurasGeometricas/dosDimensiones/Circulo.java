package unlu.poo.figurasGeometricas.dosDimensiones;

import unlu.poo.figurasGeometricas.Figura;

public class Circulo  extends Figura {
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
}
