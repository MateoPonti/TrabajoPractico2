package unlu.poo.administradorEjercicios;


import unlu.poo.billetera.Ej5.Cuenta;
import unlu.poo.billetera.Ej5.CuentaCredito;
import unlu.poo.billetera.Ej5.Usuario;

public class Ejercicio5 {
    public Ejercicio5(){
        Cuenta c=new Cuenta(200,500);
        CuentaCredito c2= new CuentaCredito(200);
        Usuario n = new Usuario(c,c2);

        System.out.println(n);

        System.out.println("Voy a activar preecancelar en la cuenta");
        n.activarPreeCancelar();
        System.out.println();


        System.out.println("Pago 700 con la cuenta normal");
        System.out.println("Resultado de pagar: "+ n.gastarCuenta(700));
        System.out.println(n.mostrarCuenta());


        System.out.println("--------------------------------------------------");
        System.out.println("Voy a desactivar preecancelar en la cuenta");
        n.desactivarPreeCancelar();
        System.out.println();
        System.out.println("Pago 700 con la cuenta normal");
        System.out.println("Resultado de pagar: "+ n.gastarCuenta(700));
        System.out.println(n.mostrarCuenta());
        System.out.println("---------------------------------------------------");
        System.out.println("Cargo 2000 pesos para poder cargar la plata del giro y poder invertir");
        n.depositarCuenta(2000);
        System.out.println("Invierto 50 pesos");
        System.out.println(n.invertirCuenta(50));
        System.out.println("---------------------------------------");
        System.out.println("Se fija si se puede recuperar inversion: "+n.obtenerInversion()+", en este caso puede pero no va aumentar el porcentaje porque no pasaron 30 dias");
        System.out.println(n);

    }
}
