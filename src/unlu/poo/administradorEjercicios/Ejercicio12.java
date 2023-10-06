package unlu.poo.administradorEjercicios;

import unlu.poo.billetera.Ej12.CajaAhorro;
import unlu.poo.billetera.Ej12.CuentaCredito;
import unlu.poo.billetera.Ej12.CuentaNormal;
import unlu.poo.billetera.Ej12.Usuario;

public class Ejercicio12 {
    public Ejercicio12(){
        Usuario usuario= new Usuario(new CuentaNormal(322,100), new CajaAhorro(200),new CuentaCredito(200) );
        System.out.println(usuario.mostrarCuentas());
        System.out.println("El testing solo es el de mostrar las cuentas, se modifico todas las clases aun asi se pueden ver en el UML o en el archivo java encontrado en package src/unlu/poo/billteras/EJ12");

    }
}
