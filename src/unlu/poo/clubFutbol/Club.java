package unlu.poo.clubFutbol;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Club {
    ArrayList<Socio> listaDeSocios;


    public Club(){
        listaDeSocios= new ArrayList<>();
    }

    public boolean cargarSocio(String nombre,Tipo suscrip, int tel, String correo,String dia){
        try    {
            LocalDate fecha=LocalDate.parse(dia,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            Socio socio= new Socio(nombre,new Suscripcion(suscrip),tel,correo,fecha);
            return true;
        }
        catch (DateTimeParseException  e){
            return false;
        }
    }

    public String devolverSocios(){
        StringBuilder listaSocios= new StringBuilder();
        for (Socio socio:listaDeSocios){
            listaSocios.append("-").append(socio).append("\n");
        }
        return listaSocios.toString();
    }


    public String devolverSociosPorSuscripcion(){
        StringBuilder listaSociosPorSuscripcion= new StringBuilder();
        listaSociosPorSuscripcion.append(cargarValor(Tipo.BASICA)).append(cargarValor(Tipo.INTERMEDIA)).append(cargarValor(Tipo.DESTACADA));
        return listaSociosPorSuscripcion.toString();
    }


    private String cargarValor(Tipo tipo){
        StringBuilder listaSociosPorSuscripcion= new StringBuilder();
        listaSociosPorSuscripcion.append("Suscriptores de la suscripcion "+tipo.toString());
        for (Socio socio:listaDeSocios){
        if (socio.getSuscripcion().comparar(tipo)){listaSociosPorSuscripcion.append("-").append(socio).append("\n");}}
        return listaSociosPorSuscripcion.toString();
    }

    private  int buscarSocio(int id){
    int pos=0;
        for (Socio socio:listaDeSocios){
            if (socio.compararId(id)){
                return pos;
            }
            pos++;
        }
     return -1;
    }




    }
