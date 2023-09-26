package unlu.poo.publicacion;

import java.util.ArrayList;

public class Libro extends PublicacionPrestadas{

    private ArrayList<Ejemplar> ejemplares;
    private String ISBN;

    public Libro(String nombre, String editor, String telefono, int cantEjemplares) {
        super(nombre, editor, telefono,cantEjemplares);
        ejemplares=new ArrayList<>();
        arrancarEjemplares(cantEjemplares);
    }


    public boolean prestar(int num) {
        return false;
    }

    private void arrancarEjemplares(int c){
        for(int i=0;i<c;i++){
            ejemplares.add(new Ejemplar(i));
        }
    }

    public boolean buscarEjemplar(int n){
        for(Ejemplar e:ejemplares){
            if (e.compararNum(n)){return true;}
        }
        return false;
    }

    public boolean agregarEjemplar(int num){
        if (!buscarEjemplar(num)){
            ejemplares.add(new Ejemplar(num));
            return true;
        }
        return false;
    }

    @Override
    public int calcularCantidadPrestamos() {
        return 0;
    }


}