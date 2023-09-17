package unlu.poo.clubFutbol;

import java.util.ArrayList;

public class Club {
    ArrayList<Socio> listaDeSocios;


    public Club(){
        listaDeSocios= new ArrayList<>();
    }

    public void cargarSocio(String nombre,Tipo suscrip){
        Socio socio= new Socio(nombre,new Suscripcion(suscrip));
    }

    public String devolverSocios(){
        StringBuilder listaSocios= new StringBuilder();
        for (Socio socio:listaDeSocios){
            listaSocios.append("-").append(socio).append("\n");
        }
        return listaSocios.toString();
    }

}
