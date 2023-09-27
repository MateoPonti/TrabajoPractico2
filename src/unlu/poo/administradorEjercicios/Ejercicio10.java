package unlu.poo.administradorEjercicios;

import unlu.poo.organizacion.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ejercicio10 {
    public Ejercicio10() {
        LocalDate fechaCumple= LocalDate.now();
        LocalDate fechaCumpleEnero= LocalDate.of(2000,01,01);
        LocalDate fechaCumpleFebrero= LocalDate.of(2000,02,01);

        ArrayList<Empleado> empleados= new ArrayList<>();

        EmpleadoComision empC= new EmpleadoComision(fechaCumple,"Mateo","Ponti","3231232","232132",100,30);
        EmpleadoComisionBase empCBase= new EmpleadoComisionBase(fechaCumple,"Pepe","Verni","3231232","232132",100,30,32);
        Pasante eP= new Pasante(fechaCumpleEnero,"Thomas", "Ponce","321323","3213");
        EmpleadoAsalariado eAsal=new EmpleadoAsalariado(fechaCumpleFebrero,"Pedro","Masar","31232","312321",300);
        EmpleadoHora eHora= new EmpleadoHora(fechaCumpleEnero,"Juan","Sordera","312312","32132",45,100);



        empleados.add(empC);
        empleados.add(empCBase);
        empleados.add(eP);
        empleados.add(eAsal);
        empleados.add(eHora);


        for (Empleado e:empleados){
            System.out.println(e);
            System.out.println("calcular Sueldo: "+ String.valueOf(e.calcularSueldo()));
            System.out.println();
            System.out.println();
            System.out.println();
        }






    }
}
