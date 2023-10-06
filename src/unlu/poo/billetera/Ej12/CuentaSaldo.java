package unlu.poo.billetera.Ej12;

import unlu.poo.billetera.EstadoPagar;

import java.time.LocalDate;

public abstract  class CuentaSaldo extends Cuenta{

    private double saldo;
    private double saldoInvertido=0;
    private static final double interesPorinversion=0.05;
    private static final int diasInversion= 30;
    private LocalDate fechaInversion;




    public CuentaSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public double calcularMontoTotal() {
        return saldo;
    }

    public boolean depositar(double cantidad){
        if (cantidad>0){
            this.saldo+=cantidad;
            return true;
        }
        return false;
    }

    public EstadoPagar gastar(double cantidad){
        if ((cantidad>0) && ((saldo)>=cantidad)){
           saldo-=cantidad;
           return EstadoPagar.RealizoPago;

        }
        return EstadoPagar.NoSePudoPagar;
    }
    public boolean invertir(double cantidad){
        if (saldo>=cantidad){
            fechaInversion=LocalDate.now();
            saldoInvertido= saldoInvertido+cantidad;
            return true;
        }
        return false;
    }

    public boolean recuperarInversion(){
        if (fechaInversion==null){return false;}
        boolean esFecha= (LocalDate.now().isAfter(fechaInversion.plusDays(diasInversion-1))); // pasaron 29 dias al menos ?
        if (esFecha){depositar(interesAGanar()*(1+interesPorinversion));}
        else{depositar(interesAGanar());} // no hay interes
        saldoInvertido=0;
        return true;
    }

    public double interesAGanar(){
        return interesPorinversion*this.saldoInvertido;
    }


    public double getSaldo() {
        return saldo;
    }




    public double getSaldoInvertido() {
        return saldoInvertido;
    }



    public LocalDate getFechaInversion() {
        return fechaInversion;
    }

    @Override
    public String toString() {
        return
                "saldo=" + saldo +
                ", saldoInvertido=" + saldoInvertido +
                ", fechaInversion=" + fechaInversion;
    }
}
