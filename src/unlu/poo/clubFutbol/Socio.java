package unlu.poo.clubFutbol;

import java.time.LocalDate;

public class Socio {
    private Suscripcion suscripcion;
    private String nombre;

    private  int telefono;


    private LocalDate fechaInscripcion;



    private String correo;

    private int id;

    private static int numerosId=0;



    public Socio(String nombre, Suscripcion suscripcion, int tel, String correo, LocalDate fecha) {
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
      return "id: "+id+", nombre: "+ getNombre()+" , Suscripcion : "+suscripcion.toString()+ " , correo : "+getCorreo()+ ", telefono: "+getTelefono();}


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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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




}
