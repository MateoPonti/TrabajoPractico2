package unlu.poo.figurasGeometricas.tresDimensiones;

public class Paralelepipedo extends FiguraTresDimensiones{

    private  double arista1;
    private  double arista2;
    private  double arista3;
    public Paralelepipedo(double arista1,double arista2, double arista3){
        this.arista1=arista1;
        this.arista2=arista2;
        this.arista3=arista3;

    }

    public double getArista1() {
        return arista1;
    }

    public void setArista1(double arista1) {
        this.arista1 = arista1;
    }

    public double getArista2() {
        return arista2;
    }

    public void setArista2(double arista2) {
        this.arista1 = arista2;
    }

    public double getArista3() {
        return arista3;
    }

    public void setArista3(double arista3) {
        this.arista1 = arista3;
    }


    @Override
    public double getArea() {
        return  2 * (arista1 * arista2 + arista1 * arista3 + arista2 * arista3);
    }

    @Override
    public double getVolumen() {
        return arista1 * arista2 * arista3;
    }

    @Override
    public String toString() {
        return "Paralelepipedo{" +
                "arista1=" + arista1 +
                ", arista2=" + arista2 +
                ", arista3=" + arista3 +
                '}';
    }
}
