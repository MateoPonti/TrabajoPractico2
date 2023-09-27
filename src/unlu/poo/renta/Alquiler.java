package unlu.poo.renta;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    private Cliente cliente;

    private Presupuesto presupuesto;

    public Alquiler( LocalDate fechaInicio,Presupuesto p,Cliente c){
        this.presupuesto=p;
        this.cliente=c;
        this.fechaInicio=fechaInicio;
        this.fechaFinal= fechaInicio.plusDays(p.getCantDias());

    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }


    public double getMonto(){
        return presupuesto.getMonto();
    }


    @Override
    public String toString() {
        return "Alquiler{" +
                ", cliente=" + cliente +
                ", presupuesto=" + String.valueOf(presupuesto.getId()) +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                '}';
    }
}
