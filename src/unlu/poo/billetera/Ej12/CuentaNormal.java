package unlu.poo.billetera.Ej12;

public class CuentaNormal extends CuentaSaldo{
    private  double limiteGiroDescubierto=1000;
    private double giroDescubierto;


    private boolean preeCancelar;



    public CuentaNormal(double saldo, double giroDescubierto) {
        super(saldo);
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
        return super.calcularMontoTotal()+ limiteGiroDescubierto;
    }

    public boolean depositar(double cantidad){
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
            super.depositar(cantidad);
            return true;
        }
        return false;
    }


    public double getLimiteGiroDescubierto() {
        return limiteGiroDescubierto;
    }



    public double getGiroDescubierto() {
        return giroDescubierto;
    }




    @Override
    public String toString() {
        return
                "cuenta Normal=" + "\n"+super.toString() +
                ", limiteGiroDescubierto=" + limiteGiroDescubierto +
                ", giroDescubierto=" + giroDescubierto;
    }
}
