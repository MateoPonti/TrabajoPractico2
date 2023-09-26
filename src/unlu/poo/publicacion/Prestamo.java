package unlu.poo.publicacion;

public class Prestamo {

   private Socio socio;

   private int numEjemplar;
   private String estadoEjemplar;
   private String libro;

    public Prestamo(Socio socio,Ejemplar ejemplar) {
        this.socio=socio;
        numEjemplar= ejemplar.getNumEjemplar();
        estadoEjemplar=ejemplar.getEstado();
        libro=ejemplar.getLibro();

    }
}
