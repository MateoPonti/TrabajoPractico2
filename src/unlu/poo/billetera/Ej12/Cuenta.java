package unlu.poo.billetera.Ej12;

import unlu.poo.billetera.EstadoPagar;

public abstract class Cuenta {

    public abstract EstadoPagar gastar(double monto);
    public abstract String toString();

}
