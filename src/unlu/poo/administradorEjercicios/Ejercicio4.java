package unlu.poo.administradorEjercicios;

import unlu.poo.billetera.Ej4.Cuenta;
import unlu.poo.billetera.Ej4.CuentaCredito;
import unlu.poo.billetera.Ej4.Usuario;

public class Ejercicio4 {
    public Ejercicio4(){
        Cuenta c=new Cuenta(200,500);
        CuentaCredito c2= new CuentaCredito(200);
        Usuario n = new Usuario(c,c2);
        System.out.println(n);

        System.out.println("--------------------------------------------------");
        System.out.println("Pago 1500 con la cuenta normal");
        System.out.println("Resultado de pagar: "+ n.gastarCuenta(1500));
        System.out.println(n.mostrarCuenta());
        System.out.println();
        System.out.println("Pago 700 con la cuenta normal");
        System.out.println("Resultado de pagar: "+ n.gastarCuenta(700));

        System.out.println(n.mostrarCuenta());

        System.out.println("-------------------------------------");
        System.out.println("Cargo 2000 pesos para poder cargar la plata del giro y poder invertir");
        c.depositar(2000);
        System.out.println("Invierto 50 pesos");
        c.invertir(50);
        System.out.println(c);
        System.out.println("---------------------------------------");
        System.out.println("Se fija si se puede recuperar inversion: "+n.obtenerInversion()+" en este caso no puede le falta n dias");





    }
}
