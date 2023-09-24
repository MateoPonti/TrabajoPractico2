package unlu.poo.academiaDanza;

import unlu.poo.agenciaTurismo.Compra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Academia {
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Comision> comisiones;


    public Academia() {
        profesores= new ArrayList<>();
        alumnos= new ArrayList<>();
        comisiones= new ArrayList<>();
    }

    public boolean agregarProfesor(String nombre, String dni) {
        if (buscarProfesorPorDNI(dni)==null){
            this.profesores.add(new Profesor(nombre,dni));
            return true;
        };
        return false;

    }

    public boolean agregarAlumno(String nombre,String dni) {
        if (buscarAlumnoPorDNI(dni)==null){
            this.alumnos.add(new Alumno(nombre,dni));
            return true;
        };
        return false;

    }

    public void agregarCom(Disciplina disciplina, String dia, String horario, Nivel nivel) {
        this.comisiones.add( new Comision(disciplina,dia,horario,nivel));
    }


    public boolean asignarProfesorComisiones(String DniProf, int idCom){
        Profesor p=buscarProfesorPorDNI(DniProf);
        Comision c= buscarCom(idCom);
        return (p!=null) && (c!=null) && c.setProfesorACargo(p);

    }


    public String mostrarAlumnos(){
        StringBuilder al= new StringBuilder("Lista de Alumnos: " + "\n");

        for (Alumno a:alumnos){
            al.append(a).append("\n");
        }
        return al.toString();
        }
    public String mostrarProfesores(){
        StringBuilder pr= new StringBuilder("Lista de Profesores: " + "\n");

        for (Profesor p:profesores){
            pr.append(p).append("\n");
        }
        return pr.toString();
    }

    public String mostrarCom(){
        StringBuilder cm= new StringBuilder("Lista de Comisiones: " + "\n");

        for (Comision c:comisiones){
            cm.append(c).append("\n");
        }
        return cm.toString();
    }


    public String calcularInformeParticipantesProfesor(String DNIProfesor){
        Profesor p=buscarProfesorPorDNI(DNIProfesor);
        if (p!=null){
            return "Comisiones y clases del profesor "+p.getNombre()+"\n"+ p.mostrarParticipacionesMes();
        };
        return "No existe un Profesor con ese DNI";
    }


    public boolean asistirAlumno(String dniAlumno, LocalDate fechaClase, int idCom){
        Alumno alumno= buscarAlumnoPorDNI(dniAlumno);
        Comision com= buscarCom(idCom);
        return (alumno != null) && (com != null) && com.asistirAlumno(alumno, fechaClase);
    }

    public boolean agregarClase(int idCom , LocalDate clase){
        Comision com=buscarCom(idCom);
        return (com!=null) && com.agregarClase(clase);
    }



    private Comision buscarCom(int id){
        for (Comision c:comisiones){
            if (c.compararCom(id)){return c;}
        }
        return null;
    }
    private Profesor buscarProfesorPorDNI(String DNI){
        for (Profesor p:profesores){
            if (p.compararDni(DNI)){ return p;}
        }
        return null;
    }

    private Alumno buscarAlumnoPorDNI(String DNI){
        for (Alumno a:alumnos){
            if (a.compararDni(DNI)){ return a;}
        }
        return null;
    }


    public String disciplinaConMasClases(){
        if (!comisiones.isEmpty()){
        ordenarComisionPorDisciplina();
        Disciplina dis1=comisiones.get(0).getDisciplina();
        Disciplina dis2=null;
        int contador=0;
        int contador2=0;
        for(Comision c: comisiones){
            if (c.getDisciplina()==dis1){ // comprueba si es el primer destino
                contador=contador+c.cantidadParticipacionMensual();
                }
            else {
                if (dis2 == null){   // comprueba que haya un segundo destino sino lo asigna
                        dis2=c.getDisciplina();
                        contador2=c.cantidadParticipacionMensual();
                }
                else {
                        if (c.getDisciplina()==dis2){ // si es el segundo suma el contador
                            contador2=contador2+c.cantidadParticipacionMensual();
                        }
                        else {
                            if (contador>contador2){ // si no es ni el primero ni el segundo debe saber cual de los 2 debe sacar
                                contador2=c.cantidadParticipacionMensual();
                                dis2=c.getDisciplina();
                            }
                            else {
                                contador=c.cantidadParticipacionMensual();
                                dis1=c.getDisciplina();
                            }}}}}
            if (contador==0 && contador2==0){return  "No hubo clases en ninguna comision en este mes";}
            if (contador==contador2){return "Hay mas de una disciplina con las mismas clases en el mes de este año: "+ dis1.toString() + " y "+dis2.toString()+ " con "+String.valueOf(contador)+".";}
            else{
                if (contador>contador2){return "Disciplina "+dis1.toString()+" se encuentra con "+String.valueOf(contador)+" clases mensuales de este año.";}
                else {return "Disciplina "+dis2+" se encuentra con "+String.valueOf(contador2)+"  clases mensuales de este año.";}
            }
        }
        return "No hay comisiones";
    }

    private void ordenarComisionPorDisciplina(){
        boolean ordenado=false;
        int i;
        Comision com1;
        Comision com2;
        while (!ordenado){
            i=1;
            ordenado=true;
            while (i<comisiones.size()){
                if ( comisiones.get(i).getDisciplina().ordinal()>comisiones.get(i-1).getDisciplina().ordinal()){
                    com1=comisiones.get(i);
                    com2=comisiones.get(i-1);
                    comisiones.set(i,com2);
                    comisiones.set(i-1,com1);
                }
                i++;
            }

        }

    }

}
