package unlu.poo.publicacion;

public class Revista extends PublicacionPrestadas{
    private String ISNN;
    private String numPublicacion;

    private int ejemplaresPrestados=0;

    private int cantEjemplares;
    private int idRevista;
    private static  int idTotales=1;
    public Revista(String nombre,String numPublicacion, String editor, String telefono,int cant,String añoP) {
        this(nombre,numPublicacion,editor,telefono,cant,"",añoP);
    }

    public Revista(String nombre,String numPublicacion, String editor, String telefono,int cant,String isnn,String añoP) {
        super(nombre, editor, telefono,cant,añoP);
        this.numPublicacion=numPublicacion;
        this.ISNN=isnn;
        idRevista=idTotales;
        idTotales++;
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

    public boolean compararId(int num){
        return idRevista==num;
    }
    public String toString() {
        return "id: "+idRevista+"  ,nombre de la revista: "+getNombre()+" ,Num Ejemplares: "+getCantEjemplares()+", Num Ejemplares Prestado: "+getCantEjemplaresPrestados()+"\n"+ "Editor: "+getEditor()+", ISNN:" +getISNN()+" , telefono: "+getTelefono()+", año publicacion:  "+getAñoPublicacion();
    }
}
