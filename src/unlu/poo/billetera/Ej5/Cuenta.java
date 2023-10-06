package unlu.poo.billetera.Ej5;

import unlu.poo.billetera.EstadoPagar;

import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private  double limiteGiroDescubierto=1000;
    private double giroDescubierto;
    private double saldoInvertido=0;
    private static final double interesPorinversion=0.05;
    private static final int diasInversion= 30;
    private LocalDate fechaInversion;

    private boolean preeCancelar;



    public Cuenta(double saldo, double giroDescubierto) {
        this.saldo = saldo;
        setGiroDescubierto(giroDescubierto);
    }

    public boolean isPreeCancelar() {
        return preeCancelar;
    }

    public void setPreeCancelar(boolean preeCancelar) {
        this.preeCancelar = preeCancelar;
    }

    public void setGiroDescubierto(double giroDescubierto) {
        if (giroDescubierto>1000) {this.giroDescubierto=1000;}
        else {this.giroDescubierto = giroDescubierto;}
    }


    public double calcularMontoTotal() {
        return saldo+ limiteGiroDescubierto;
    }

    public boolean  depositar(double cantidad){
        if (cantidad>0){
        if (giroDescubierto<limiteGiroDescubierto){
            if (getLimiteGiroDescubierto()<cantidad){
                giroDescubierto=limiteGiroDescubierto;
                cantidad-=limiteGiroDescubierto;
            }
            else{
                limiteGiroDescubierto+=cantidad;
                cantidad=0;
            }
        }
        this.saldo+=cantidad;
        return true;
        }
        return false;
    }

    public EstadoPagar gastar(double cantidad){
        if ((cantidad>0) && ((saldo+giroDescubierto)>=cantidad)){
           if (saldo>=cantidad){saldo-=cantidad;
           return EstadoPagar.RealizoPago;
           }
           else {
               if(!preeCancelar){
               cantidad-=saldo;
               saldo=0;
               giroDescubierto-=cantidad;
               return EstadoPagar.PagoConGiro;}
               return EstadoPagar.PagoCanceladoPorGiro;
           }
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



    public double getLimiteGiroDescubierto() {
        return limiteGiroDescubierto;
    }

    public void setLimiteGiroDescubierto(double limiteGiroDescubierto) {
        this.limiteGiroDescubierto = limiteGiroDescubierto;
    }

    public double getGiroDescubierto() {
        return giroDescubierto;
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
                ", limiteGiroDescubierto=" + limiteGiroDescubierto +
                ", giroDescubierto=" + giroDescubierto +
                ", saldoInvertido=" + saldoInvertido +
                ", fechaInversion=" + fechaInversion ;
    }
}
