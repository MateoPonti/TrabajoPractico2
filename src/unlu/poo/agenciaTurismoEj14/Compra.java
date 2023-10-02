package unlu.poo.agenciaTurismoEj14;


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

    @Override
    public String toString() {
        return "Cliente:  "+"\n"+cliente+"\n"+"Paquete Turismo: "+paquete;
    }
}

