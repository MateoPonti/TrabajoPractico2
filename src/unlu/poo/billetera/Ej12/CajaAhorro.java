package unlu.poo.billetera.Ej12;

public class CajaAhorro extends CuentaSaldo{
    public CajaAhorro(double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro: " + super.toString();
    }
}
