package unlu.poo.clubFutbol;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Club {
    ArrayList<Socio> listaDeSocios;
    ArrayList<Actividad> listaDeActividades;

    public Club(){
        listaDeSocios= new ArrayList<>();
        listaDeActividades= new ArrayList<>();
    }

    public boolean cargarSocio(String nombre,Tipo suscrip, String tel, String correo,String dia){
        try    {
            LocalDate fecha=LocalDate.parse(dia,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            Socio socio= new Socio(nombre,new Suscripcion(suscrip),tel,correo,fecha);
            listaDeSocios.add(socio);
            return true;
        }
        catch (DateTimeParseException  e){
            return false;
        }
    }

    public String devolverSocios(){
        StringBuilder listaSocios= new StringBuilder();
        listaSocios.append("Lista Socios").append("\n");
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
        listaSociosPorSuscripcion.append("Suscriptores de la suscripcion "+tipo.toString()).append("\n");
        for (Socio socio:listaDeSocios){
        if (socio.getSuscripcion().comparar(tipo)){listaSociosPorSuscripcion.append("-").append(socio).append("\n");}}
        listaSociosPorSuscripcion.append("\n");
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


    public String sociosInscriptosEsteMes(){
        LocalDate fecha= LocalDate.now();
        StringBuilder listaSociosInscriptosEsteMes=new StringBuilder();
        listaSociosInscriptosEsteMes.append("Inscriptos el Mes de "+fecha.getMonth().toString()).append(" de este Año: ").append("\n");
        for (Socio socio:listaDeSocios){
            if (socio.compararMesInscripcion(fecha)){listaSociosInscriptosEsteMes.append("-").append(socio).append("\n");}}
        return listaSociosInscriptosEsteMes.toString();
    }

    public boolean agregarActividad(String titulo, Tipo actividad){
        if (!buscarActivdad(titulo)){
            listaDeActividades.add(new Actividad(titulo,actividad));
            return true;
        }
        return false;
    }

    private boolean buscarActivdad(String titulo){
        Actividad actividadComparar=new Actividad(titulo,Tipo.BASICA);
        for (Actividad act:listaDeActividades){
            if (act.equals(actividadComparar)){
                return true;
            }
        }
        return false;
    }


    private String buscarActidadTipo(Tipo tipo){
        StringBuilder listaSociosActividad= new StringBuilder();
        listaSociosActividad.append("Actividad de la suscripcion "+tipo.toString()).append("\n");
        for (Actividad act:listaDeActividades){
            if (act.compararActividad(tipo)){listaSociosActividad.append("-").append(act).append("\n");}}
        listaSociosActividad.append("\n");
        return listaSociosActividad.toString();
    }
    public String devolverListaActividades(){
        StringBuilder listaSociosActividad= new StringBuilder();
        listaSociosActividad.append(buscarActidadTipo(Tipo.BASICA)).append(buscarActidadTipo(Tipo.INTERMEDIA)).append(buscarActidadTipo(Tipo.DESTACADA));
        return listaSociosActividad.toString();
    }





    }
