package unlu.poo.billetera.Ej5;

import unlu.poo.billetera.EstadoPagar;

public class Usuario {
    private Cuenta cuenta;
    private CuentaCredito cuentaCredito;

    public Usuario(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Usuario(Cuenta cuenta, CuentaCredito cuenta1) {
        this.cuenta = cuenta;
        this.cuentaCredito = cuenta1;
    }



    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setCuentaCredito(CuentaCredito cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }

    public EstadoPagar gastarCuenta(double monto){
        return  this.cuenta.gastar(monto);

    }

    public boolean gastarCuentaCredito(double monto){
       return  hayCuentaCredito() && cuentaCredito.comprar(monto);
    }

    public boolean depositarCuenta(double monto){
        return  cuenta.depositar(monto);
    }

    public boolean pagarCuentaCredito(double monto, String indice){
        return cuentaCredito.pagar(monto,indice);
    }


    public void  activarPreeCancelar(){
       cuenta.setPreeCancelar(true);
    }

    public void  desactivarPreeCancelar(){
        cuenta.setPreeCancelar(false);
    }
    public String mostrarCuenta(){
        return cuenta.toString();
    }


    public String mostrarCuentaCredito(){
        if (hayCuentaCredito()){
        return cuentaCredito.toString();}
        return "No existe cuenta Credito";
    }

    public boolean hayCuentaCredito(){
        return this.cuentaCredito!=null;
    }

    public boolean invertirCuenta(double monto){
        return cuenta.invertir(monto);
    }


    public boolean obtenerInversion(){
        return cuenta.recuperarInversion();
    }
    @Override
    public String toString() {
        return "Usuario{" +"\n"+
                "Cuenta=" +"\n"+ cuenta +"\n"+"\n"+"\n"+
                "Cuenta Credito="+"\n" + cuentaCredito +
                '}';
    }
}
