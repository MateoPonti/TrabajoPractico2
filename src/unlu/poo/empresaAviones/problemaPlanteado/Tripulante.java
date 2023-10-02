package unlu.poo.empresaAviones.problemaPlanteado;

import java.util.ArrayList;

public class Tripulante extends Persona{

    private ArrayList<ReciboSueldo> recibos;
    private String cargo;
    public Tripulante(String nombre, String numeroTelefono, String direccion,String cargo) {
        super(nombre, numeroTelefono, direccion);
        recibos=new ArrayList<>();
        this.cargo=cargo;
    }

    public  void agregarRecibo(ReciboSueldo recibo) {
        recibos.add(recibo);
    }

    @Override
    public String toString() {
        return super.toString()+", Tripulante ";
    }
}
