package unlu.poo.administradorEjercicios;

import unlu.poo.figurasGeometricas.Figura;
import unlu.poo.figurasGeometricas.dosDimensiones.Circulo;
import unlu.poo.figurasGeometricas.dosDimensiones.Cuadrado;
import unlu.poo.figurasGeometricas.dosDimensiones.Rectangulo;
import unlu.poo.figurasGeometricas.dosDimensiones.Triangulo;
import unlu.poo.figurasGeometricas.tresDimensiones.FiguraTresDimensiones;
import unlu.poo.figurasGeometricas.tresDimensiones.Paralelepipedo;
import unlu.poo.figurasGeometricas.tresDimensiones.Tetraedo;

import java.util.ArrayList;

public class Ejercicio9 {
    public Ejercicio9(){

        ArrayList<Figura> figuras=new ArrayList<>();
        ArrayList<FiguraTresDimensiones> figuras3D=new ArrayList<>();


        figuras.add(new Cuadrado(3));
        figuras.add(new Circulo(9));
        figuras.add(new Tetraedo(3));
        figuras.add(new Paralelepipedo(3,2,1));
        figuras.add(new Triangulo(2,4));
        figuras.add(new Rectangulo(2,2));

        figuras3D.add(new Tetraedo(3));
        figuras3D.add(new Paralelepipedo(3,2,1));


        System.out.println("Area de figuras");
        for (Figura f:figuras){
            System.out.println(f);
            System.out.println("Area : "+String.valueOf(f.getArea()));
            System.out.println();
        }


        System.out.println(" ------------------------------------------------------------------");
        System.out.println("Volumen figuras 3 d");

        for (FiguraTresDimensiones f:figuras3D){
            System.out.println(figuras3D);
            System.out.println("Volumen : "+String.valueOf(f.getVolumen()));
            System.out.println();
        }
    }
}
