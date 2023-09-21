package unlu.poo.agenciaTurismo;

import java.util.ArrayList;
import java.util.Objects;

public class Agencia {
    private  ArrayList<Cliente> clientes;
    private  ArrayList<Compra> compras;
    private  ArrayList<Excursion> excursiones;
    private  ArrayList<MedioDeTransporte> mediosTransporte;
    private  ArrayList<Hospedaje> hospedaje;
    private  ArrayList<PaqueteTurismo> paqueteTurismo;
    private  ArrayList<GuiaTurismo> guias;

    public void agregarGuia(String nombre){
        guias.add(new GuiaTurismo(nombre));
    }
    public String mostrarGuias(){
        StringBuilder nombresGuia= new StringBuilder();
        nombresGuia.append("Guias: ").append("\n");
        for(GuiaTurismo g: guias){
            nombresGuia.append(g).append("\n");
        }
        return nombresGuia.toString();
    }


    public void agregarCliente(String nombre) {
        clientes.add(new Cliente(nombre));

    }
    public String mostrarClientes(){
        StringBuilder nombresClientes= new StringBuilder();
        nombresClientes.append("Clientes: ").append("\n");
        for(Cliente cl: clientes){
            nombresClientes.append(cl).append("\n");
        }
        return nombresClientes.toString();
    }


    public void agregarExcursion(String nombre) {
        excursiones.add(new Excursion(nombre));

    }

    public String mostrarExcursiones() {
        StringBuilder nombresExcursiones= new StringBuilder();
        nombresExcursiones.append("Excursiones: ").append("\n");
        for(Excursion ex: excursiones){
            nombresExcursiones.append(ex).append("\n");
        }
        return nombresExcursiones.toString();
    }


    public void agregarPaqueteTurismo(String nombre, ) {

    }

    public String mostrarPaquetesDeTurismo() {
        StringBuilder paquetesTurismoStr= new StringBuilder();
        paquetesTurismoStr.append("Paquetes de Turismo: ").append("\n");
        for(PaqueteTurismo pqt: paqueteTurismo){
            paquetesTurismoStr.append(pqt).append("\n");
        }
        return paquetesTurismoStr.toString();

    }


    public boolean agregarCompra(int idCliente, int idPaqueteTurismo){
        Cliente cliente= buscarClienteid(idCliente);
        PaqueteTurismo pqt= buscarPaqueteTurismo(idPaqueteTurismo);
        if(cliente == null || pqt == null){ return false;}
        compras.add(new Compra(cliente,pqt));
        return true;
    }


    private Cliente buscarClienteid(int idCliente){
        for(Cliente c:clientes){
            if (c.compararId(idCliente)){
                return c;
            }
        }
        return null;
    }


    private PaqueteTurismo buscarPaqueteTurismo(int idPaqueteTurismo){
        for(PaqueteTurismo pqt:paqueteTurismo){
            if (pqt.compararId(idPaqueteTurismo)){
                return pqt;
            }
        }
        return null;
    }


    public String mostrarCompras() {
        ordenarComprasPorDestino();
        StringBuilder comprasStr= new StringBuilder();
        comprasStr.append("Compras: ").append("\n");
        for(Compra cp: compras){
            comprasStr.append(cp).append("\n");
        }
        return comprasStr.toString();
    }




    public String mostrarDestinoFavorito(){
        if (!compras.isEmpty()){
        ordenarComprasPorDestino();
        String destino1=compras.get(0).getDestino();
        String destino2=null;
        int contador=0;
        int contador2=0;
        for(Compra c: compras){
            if (c.getDestino().equals(destino1)){ // comprueba si es el primer destino
                contador++;
            }
            else {
                if (destino2 == null){   // comprueba que haya un segundo destino sino lo asigna
                    destino2=c.getDestino();
                    contador2++;
                }
                else {
                    if (Objects.equals(c.getDestino(), destino2)){ // si es el segundo suma el contador
                        contador2++;
                    }
                    else {
                        if (contador>contador2){ // si no es ni el primero ni el segundo debe saber cual de los 2 debe sacar
                            contador2=1;
                            destino2=c.getDestino();
                        }
                        else {
                            contador=1;
                            destino1=c.getDestino();
                        }}}}}
        if (contador>contador2){return destino1;}
        else {return destino2;}
        }
        return "No hay ninguna compra";

    }

    private void ordenarComprasPorDestino(){
        boolean ordenado=false;
        int i;
        Compra compra1;
        Compra compra2;
        while (!ordenado){
            i=1;
            ordenado=true;
            while (i<compras.size()){
                if ( compras.get(i).getDestino().compareTo(compras.get(i-1).getDestino())<0){
                    compra1=compras.get(i);
                    compra2=compras.get(i-1);
                    compras.set(i,compra2);
                    compras.set(i-1,compra1);
                }
                i++;
            }

        }

    }


}
