package unlu.poo.billetera;

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

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public CuentaCredito getCuentaCredito() {
        return cuentaCredito;
    }

    public void setCuentaCredito(CuentaCredito cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }
}
