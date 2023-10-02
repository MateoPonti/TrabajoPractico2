package unlu.poo.empresaAviones.solucionPropuesta;


import java.util.ArrayList;

public class Tripulante extends Rol {

    private ArrayList<ReciboSueldo> recibos;
    private String cargo;
    public Tripulante(String cargo) {
        recibos=new ArrayList<>();
        this.cargo=cargo;
    }

    public  void agregarRecibo(ReciboSueldo recibo) {
        recibos.add(recibo);
    }

    @Override
    public String toString() {
        return "Tripulante , Cargo: "+cargo;
    }
}
