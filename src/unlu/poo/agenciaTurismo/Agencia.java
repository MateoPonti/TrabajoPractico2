package unlu.poo.agenciaTurismo;

import java.util.ArrayList;
import java.util.Objects;

public class Agencia {
    private  ArrayList<Cliente> clientes;
    private  ArrayList<Compra> compras;
    private  ArrayList<Excursion> excursiones;
    private  ArrayList<MedioDeTransporte> mediosTransporte;
    private  ArrayList<Hospedaje> hospedajes;
    private  ArrayList<PaqueteTurismo> paqueteTurismo;
    private  ArrayList<GuiaTurismo> guias;


    public Agencia() {
        clientes=new ArrayList<>();
        compras=new ArrayList<>();
        excursiones= new ArrayList<>();
        mediosTransporte= new ArrayList<>();
        hospedajes= new ArrayList<>();
        paqueteTurismo= new ArrayList<>();
        guias= new ArrayList<>();
    }

    public void agregarHospedaje(String nombre, TipoHospedaje tipo){
        hospedajes.add(new Hospedaje(nombre,tipo));
    }

    public String mostrarHospedaje(){
        StringBuilder mostrarHospedajeStr= new StringBuilder();
        mostrarHospedajeStr.append("Hospedajes: ").append("\n");
        for(Hospedaje hd: hospedajes){
            mostrarHospedajeStr.append(hd).append("\n");
        }
        return mostrarHospedajeStr.toString();
    }

    public void agregarMedioTransporte( String nombre,TipoMedio tipo){
        mediosTransporte.add(new MedioDeTransporte(tipo,nombre));
    }

    public String mostrarMedios(){
        StringBuilder mostrarMediosstr= new StringBuilder();
        mostrarMediosstr.append("Medios: ").append("\n");
        for(MedioDeTransporte md: mediosTransporte){
            mostrarMediosstr.append(md).append("\n");
        }
        return mostrarMediosstr.toString();
    }
    public void agregarGuia(String nombre,ArrayList<String> excursiones){
        GuiaTurismo guia= new GuiaTurismo(nombre);
        for (String e:excursiones){
            guia.agregarExcursion(e);
        }
        guias.add(guia);
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


    public boolean agregarExcursion(String nombre) {
        for(Excursion e:excursiones){
            if (e.equals(nombre)){return false;}
        }
        excursiones.add(new Excursion(nombre));
        return true;
    }

    public String mostrarExcursiones() {
        StringBuilder nombresExcursiones= new StringBuilder();
        nombresExcursiones.append("Excursiones de la agencia: ").append("\n");
        for(Excursion ex: excursiones){
            nombresExcursiones.append(ex).append("\n");
        }
        return nombresExcursiones.toString();
    }


    public boolean agregarPaqueteTurismo(String destino,String nombreMedio,TipoMedio tipoMedio, ArrayList<String> excursiones,String nombreHospedaje, TipoHospedaje tipoHospedaje, String nombreGuia) {
        Hospedaje hd=buscarHospedaje(tipoHospedaje, nombreHospedaje);
        MedioDeTransporte md= buscarMedio(tipoMedio,nombreMedio);
        GuiaTurismo gT= buscarGuia(nombreGuia);
        ArrayList<Excursion> listaExcursiones= buscarExcursiones(excursiones);
        if(hd!=null && md!=null && gT!=null && listaExcursiones!=null && gT.guiaLasExcursiones(listaExcursiones) ){
            paqueteTurismo.add(new PaqueteTurismo(destino,md,listaExcursiones,hd,gT));
            return true;
        }
        return false;
    }

    private  MedioDeTransporte buscarMedio(TipoMedio tipo,String nombreMedio){
        MedioDeTransporte mdComp= new MedioDeTransporte(tipo,nombreMedio);
        for (MedioDeTransporte md:mediosTransporte){
            if (mdComp.equals(md)){
                return md;
            }
        }
        return null;
    }

    private  Hospedaje buscarHospedaje(TipoHospedaje tipo,String nombreHospedaje){
        Hospedaje hdComp= new Hospedaje(nombreHospedaje, tipo);
        for (Hospedaje hd:hospedajes){
            if (hdComp.equals(hd)){
                return hd;
            }
        }
        return null;
    }

    private  GuiaTurismo buscarGuia(String nombre){
        GuiaTurismo guiaComp= new GuiaTurismo(nombre);
        for (GuiaTurismo guia:guias){
            if (guia.equals(guiaComp)){
                return guia;
            }
        }
        return null;
    }

    private ArrayList<Excursion> buscarExcursiones(ArrayList<String> excursiones){
        ArrayList<Excursion>  listaExcursiones= new ArrayList<>();
        for (String excursionDada: excursiones){
            Excursion e=buscarExcursion(excursionDada);
            if (e==null){
                return null;
            }
            listaExcursiones.add(e);
        }
       return listaExcursiones;
    }
    private Excursion buscarExcursion(String nombre){
        Excursion exComp= new Excursion(nombre);
        for ( Excursion e:excursiones){
            if (e.equals(exComp)){ return  e;}
        }
        return null;
    }

    public String mostrarPaquetesDeTurismo() {
        StringBuilder paquetesTurismoStr= new StringBuilder();
        paquetesTurismoStr.append("Paquetes de Turismo: ").append("\n");
        for(PaqueteTurismo pqt: paqueteTurismo){
            paquetesTurismoStr.append(pqt).append("\n").append("\n").append("\n");
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
            comprasStr.append(cp).append("\n").append("\n").append("\n");
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

        if (contador==contador2){return "Hay mas de un destino con igual cantidad de compras, ejemplo: "+ destino1 + " y "+destino2+ " con "+String.valueOf(contador)+".";}
        else{
        if (contador>contador2){return destino1+" se encuentra en "+String.valueOf(contador)+" compras.";}
        else {return destino2+" se encuentra en "+String.valueOf(contador2)+" compras.";}
        }
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
