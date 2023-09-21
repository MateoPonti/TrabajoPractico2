package main;


import unlu.poo.administradorEjercicios.*;

import  java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        System.out.println("---SE RECOMIENDO AMPLIAR LA PANTALLA PARA LEER TODO---");
        arrancarBucle();
    }

    private static void arrancarBucle(){
        Scanner sc = new Scanner(System.in);
        boolean bucle=true;

        while (bucle){
            mostrarMenu();
            String option= sc.nextLine();
            switch (option) {
                case ("0") -> bucle = false;
                case ("1") -> new Ejercicio1();
                case ("2") -> new Ejercicio2();
             2   case ("3") -> new Ejercicio3();
                case ("4") -> new Ejercicio4();
                case ("5") -> new Ejercicio5();
                case ("6") -> new Ejercicio6();
                case ("7") -> new Ejercicio7();
                case("8")  -> new Ejercicio8();
                case("9")  -> new Ejercicio9();
                case("10")  -> new Ejercicio10();
                case("11")  -> new Ejercicio11();
                case("12")  -> new Ejercicio12();
                case("13")  -> new Ejercicio13();
                case("14")  -> new Ejercicio14();
                default -> System.out.println("No existe esa Opcion.");
            }
            System.out.println();
        }
    }
    private static void mostrarMenu(){
        System.out.println("-ingrese el numero segun que ejercicio quiere (1-14)");
        System.out.println("-ingrese 0 para salir");
    }

}