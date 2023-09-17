package unlu.poo.figurasGeometricas.tresDimensiones;

public class Tetraedo {

    private double arista;
    public Tetraedo(double arista){
     this.arista=arista;
    }




    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista1 = arista;
    }


    public double getArea() {
        return  Math.pow(arista,2)*Math.cbrt(3);
    }

    @Override
    public double getVolumen() {
        return Math.pow(arista,3)*(Math.sqrt(2)/12);
    }
}
