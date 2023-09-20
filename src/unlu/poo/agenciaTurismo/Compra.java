package unlu.poo.agenciaTurismo;

public class Compra {
    private Cliente cliente;
    private PaqueteTurismo paquete;


    public Compra(Cliente cliente, PaqueteTurismo paquete) {
        this.cliente = cliente;
        this.paquete = paquete;
    }

    public String getDestino(){
        return paquete.getDestino();
    }
}
