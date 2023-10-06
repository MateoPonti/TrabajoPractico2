package unlu.poo.billetera;

import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private static  final double limiteGiroDescubierto=1000;
    private double giroDescubierto;
    private double saldoInvertido;
    private static final double interesPorinversion=0.05;
    private LocalDate fechaInversion;



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





}
