package unlu.poo.empresaAviones.solucionPropuesta;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String numeroTelefono;
    private String direccion;

    private ArrayList<Rol> roles;

    public Persona(String nombre, String numeroTelefono, String direccion) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        roles=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", numero telefono='" + numeroTelefono + '\'' +
                ", direccion='" + direccion + '\''
                +"Rol/es= "+mostrarRoles();
    }

    public void agregarRol(Rol rol){
        roles.add(rol);
    }

    public String mostrarRoles() {
        StringBuilder listaRolesstr= new StringBuilder();
        listaRolesstr.append("Lista Roles").append("\n");
        for (Rol r:roles){
            listaRolesstr.append("-").append(r).append("\n");}
        return listaRolesstr.toString();
    }
}
