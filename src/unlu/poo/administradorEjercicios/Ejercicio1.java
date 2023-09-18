package unlu.poo.administradorEjercicios;

import unlu.poo.clubFutbol.Club;
import unlu.poo.clubFutbol.Tipo;

public class Ejercicio1 {

    public Ejercicio1(){
        Club club = new Club();
        club.agregarActividad("Basquet", Tipo.BASICA);
        club.agregarActividad("Futbol", Tipo.BASICA);
        club.agregarActividad("Ping Pong", Tipo.INTERMEDIA);
        club.agregarActividad("Metegol", Tipo.INTERMEDIA);
        club.agregarActividad("VoleiBol", Tipo.DESTACADA);
        club.agregarActividad("Spa", Tipo.DESTACADA);

        club.cargarSocio("Pedro",Tipo.BASICA,"23234123233","pedro@gmail.com","23-12-2014");
        club.cargarSocio("Juana",Tipo.INTERMEDIA,"32134212","juanaPazini@outlook.com","23-09-2023");
        club.cargarSocio("Elena",Tipo.INTERMEDIA,"32134212","ElenaZsj@outlook.com","22-10-2023");
        club.cargarSocio("José",Tipo.DESTACADA,"4123231","JoseM@gmail.com","02-11-2023");



        System.out.println(club.sociosInscriptosEsteMes());
        System.out.println("-----------------------------------------------------");
        System.out.println(club.devolverListaActividades());
        System.out.println("-----------------------------------------------------");
        System.out.println(club.devolverSociosPorSuscripcion());
    }
}
