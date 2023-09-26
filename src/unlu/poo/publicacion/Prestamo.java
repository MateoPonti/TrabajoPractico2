package unlu.poo.publicacion;

public class Prestamo {

   private String nombreSocio;
   private int numSocio;

   private int numEjemplar;
   private String estadoEjemplar;
   private String libro;

    public Prestamo(Socio socio,Ejemplar ejemplar) {
        nombreSocio= socio.getNombre();
        numSocio= socio.getNumSocio();
        numEjemplar= ejemplar.getNumEjemplar();
        estadoEjemplar=ejemplar.getEstado();

    }
}
