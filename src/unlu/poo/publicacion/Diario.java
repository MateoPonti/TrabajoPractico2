package unlu.poo.publicacion;

import java.time.LocalDate;

public class Diario extends PublicacionSinPrestar{
 private LocalDate fechaPublicacion;

 public Diario(String nombre, String editor, String telefono) {
        super(nombre, editor, telefono);
 }


 public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
 }

 public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
 }
}
