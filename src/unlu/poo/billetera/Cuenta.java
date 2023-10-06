package unlu.poo.billetera;

import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private  double limiteGiroDescubierto=1000;
    private double giroDescubierto;
    private double saldoInvertido=0;
    private static final double interesPorinversion=0.05;
    private static final int diasInversion= 15;
    private LocalDate fechaInversion;

    public Cuenta(double saldo, double giroDescubierto) {
        this.saldo = saldo;
        this.giroDescubierto = giroDescubierto;
    }

    public double calcularMontoTotal() {
        return saldo+ limiteGiroDescubierto;
    }

    public boolean  depositar(double cantidad){
        if (cantidad>0){
        if (giroDescubierto<limiteGiroDescubierto){
            giroDescubierto+=cantidad;
            if (giroDescubierto<1000){cantidad=0;}
            else{cantidad= giroDescubierto-1000;}
        }
        this.saldo+=cantidad;
        return true;
        }
        return false;
    }

    public boolean gastar(double cantidad){
        if ((cantidad>0) && ((saldo+giroDescubierto)>cantidad)){
           if (saldo>=cantidad){saldo-=cantidad;}
           else {
               cantidad-=saldo;
               saldo=0;
               giroDescubierto-=cantidad;
           }
           return true;
        }
        return false;
    }
    public boolean invertir(double cantidad){
        boolean esFecha= (fechaInversion==null) || (LocalDate.now().isAfter(fechaInversion.plusDays(diasInversion)));
        if ((saldo>=cantidad)  && esFecha) {
            LocalDate fechaInversion=LocalDate.now();
            saldo-=cantidad;
            saldoInvertido+=cantidad;
            return true;
        }
        return false;
    }

    public boolean recuperarInversion(){
        boolean esFecha= (fechaInversion!=null) || (LocalDate.now().isAfter(fechaInversion.plusDays(diasInversion)));
        if (esFecha){
            saldo+=interesAGanar();
            saldoInvertido=0;
        }
        return false;


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


}
