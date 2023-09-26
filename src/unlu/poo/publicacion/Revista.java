package unlu.poo.publicacion;

public class Revista extends PublicacionPrestadas{
    private String ISNN;
    private String numPublicacion;

    private int ejemplaresPrestados=0;

    private int cantEjemplares;
    public Revista(String nombre,String numPublicacion, String editor, String telefono,int cant,String añoP) {
        this(nombre,numPublicacion,editor,telefono,cant,"",añoP);
    }

    public Revista(String nombre,String numPublicacion, String editor, String telefono,int cant,String isnn,String añoP) {
        super(nombre, editor, telefono,cant,añoP);
        this.numPublicacion=numPublicacion;
        this.ISNN=isnn;
    }


    public int getNumEjemplaresDisponibles(){
        return getCantEjemplares()-getCantEjemplaresPrestados();
    }
    public boolean prestar(int cantidad) {
        if (getNumEjemplaresDisponibles()-cantidad>1){
            this.ejemplaresPrestados+=cantidad;
            return  true;
        }
        return  false;
    }

    public boolean devolver(int cant){
        if ((cant+getNumEjemplaresDisponibles())<=getCantEjemplares()){
            ejemplaresPrestados-=cant;
            return true;
        }
        return false;
    }


    public String getISNN() {
        return ISNN;
    }

    public String getNumPublicacion() {
        return numPublicacion;
    }




    @Override
    public int getCantEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public String toString() {
        return getNombre()+" del editor: "+getEditor()+", ISNN:" +getISNN()+" , telefono: "+getTelefono()+", año publicacion:  "+getAñoPublicacion();
    }
}
