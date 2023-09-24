package unlu.poo.agenciaTurismo;

import java.util.ArrayList;

public class PaqueteTurismo {
 private String Destino;

 private MedioDeTransporte medioTransporte;

 private ArrayList<Excursion> excursiones;

 private Hospedaje hospedaje;

 private GuiaTurismo guiaTurismo;

private static int idTotal=1;
private int id;

 public PaqueteTurismo(String destino, MedioDeTransporte medioTransporte, ArrayList<Excursion> excursiones, Hospedaje hospedaje, GuiaTurismo guiaTurismo) {
  Destino = destino.toLowerCase();
  this.medioTransporte = medioTransporte;
  this.excursiones = excursiones;
  this.hospedaje = hospedaje;
  this.guiaTurismo = guiaTurismo;
  id=idTotal;
  idTotal++;
 }

 public String getDestino() {
  return Destino;
 }

 public void setDestino(String destino) {
  Destino = destino.toLowerCase();
 }

 public MedioDeTransporte getMedioTransporte() {
  return medioTransporte;
 }

 public void setMedioTransporte(MedioDeTransporte medioTransporte) {
  this.medioTransporte = medioTransporte;
 }

 public ArrayList<Excursion> getExcursiones() {
  return excursiones;
 }

 public void setExcursiones(ArrayList<Excursion> excursiones) {
  this.excursiones = excursiones;
 }

 public Hospedaje getHospedaje() {
  return hospedaje;
 }

 public void setHospedaje(Hospedaje hospedaje) {
  this.hospedaje = hospedaje;
 }

 public GuiaTurismo getGuiaTurismo() {
  return guiaTurismo;
 }

 public void setGuiaTurismo(GuiaTurismo guiaTurismo) {
  this.guiaTurismo = guiaTurismo;
 }


 public String mostrarExcursion(){
  StringBuilder excursionesStr= new StringBuilder();
  for (Excursion ex:excursiones){
   excursionesStr.append(ex.getNombre()).append("\n");
  }
  return excursionesStr.toString();
 }
 @Override
 public String toString() {
  return  "id Paquete turismo= "+id+"\n"+
          " Destino= "+ Destino+"\n"+
          " medioTransporte= " + medioTransporte +"\n"+
          " excursiones= " +"\n"+"  "+ mostrarExcursion() +"\n"+
          " hospedaje= " + hospedaje +"\n"+
          " guiaTurismo= " + guiaTurismo.getNombre();
 }

 public boolean compararId(int id){ return  id==this.id;}
}
