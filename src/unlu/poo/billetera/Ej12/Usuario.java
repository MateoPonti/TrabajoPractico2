package unlu.poo.billetera.Ej12;

import unlu.poo.billetera.EstadoPagar;

import java.util.ArrayList;

public class Usuario {
    private ArrayList<Cuenta> cuentas;

    public Usuario(CuentaNormal cuenta) {
        cuentas=new ArrayList<>();
        this.cuentas.add(cuenta);
    }

    public Usuario(CuentaNormal cuenta, CuentaCredito cuentaCredito) {
        cuentas=new ArrayList<>();
        this.cuentas.add(cuenta);
        this.cuentas.add(cuentaCredito);
    }

    public Usuario(CuentaNormal cuenta, CajaAhorro cajaAhorro, CuentaCredito cuentaCredito) {
        cuentas=new ArrayList<>();
        this.cuentas.add(cuenta);
        this.cuentas.add(cuentaCredito);
        this.cuentas.add(cajaAhorro);
    }

    public String mostrarCuentas(){
        StringBuilder cuentasStr= new StringBuilder("Lista de Cuentas").append("\n");
        for (Cuenta c:cuentas){
            cuentasStr.append("- ").append(c).append("\n");
        }
        return cuentasStr.toString();
    }



}
