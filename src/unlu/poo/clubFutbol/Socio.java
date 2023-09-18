package unlu.poo.clubFutbol;

import java.time.LocalDate;

public class Socio {
    private Suscripcion suscripcion;
    private String nombre;

    private  String telefono;


    private LocalDate fechaInscripcion;



    private String correo;

    private int id;

    private static int numerosId=0;



    public Socio(String nombre, Suscripcion suscripcion, String tel, String correo, LocalDate fecha) {
        this.nombre=nombre;
        this.suscripcion=suscripcion;
        this.correo=correo;
        this.telefono=tel;
        this.fechaInscripcion=fecha;
        numerosId++;
        id=numerosId;

    }

    @Override
    public String toString() {
      return "id: "+id+", nombre: "+ getNombre()+" , Suscripcion : "+suscripcion.getTipo().toString()+ " , correo : "+getCorreo()+ ", telefono: "+getTelefono()+", dia de inscripcion: "+this.fechaInscripcion.toString();}


    public void setSuscripcion(Suscripcion suscripcion){
     this.suscripcion=suscripcion;
    }
    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean compararId(int numero) {
        return id==numero;
    }


    public  boolean compararMesInscripcion(LocalDate fecha){

        return fecha.getMonth()==fechaInscripcion.getMonth() && fecha.getYear()==fechaInscripcion.getYear();
    }


}
