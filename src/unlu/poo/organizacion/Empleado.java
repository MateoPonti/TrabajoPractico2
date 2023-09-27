package unlu.poo.organizacion;

import java.time.LocalDate;

public abstract class  Empleado {
    private LocalDate fechaCumple;
    private String nombre;
    private String apellido;
    private String telefono;
    private String cuit;

    private int id;
    private static int idTotal=1;

    public Empleado(LocalDate fechaCumple, String nombre,String apellido,String telefono, String cuit) {
        this.fechaCumple = fechaCumple;
        this.nombre = nombre;
        this.id=idTotal;
        this.telefono=telefono;
        this.apellido=apellido;
        this.cuit=cuit;
        idTotal++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }


    public double calcularSueldo(){
        if (isCumple()){return getSueldoCumple();};
        return 0;
    };


    public boolean isCumple(){
        LocalDate fecha= LocalDate.now();
        return fecha.getMonth()==fechaCumple.getMonth();
    };
    public double getSueldoCumple(){
        return 2000;
    };

    public boolean compararId(int num){
        return id==num;
    }

    @Override
    public String toString() {
        return "fechaCumple=" + fechaCumple +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuit='" + cuit + '\'' +
                ", id=" + id ;
    }
}
