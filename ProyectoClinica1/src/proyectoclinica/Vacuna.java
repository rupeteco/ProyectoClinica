package proyectoclinica;

public class Vacuna {
    
    private int id;
    private int recuerdo;
    private String nombr;
    private float precio;
    
    //constructor
    
    Vacuna (){}
    
    Vacuna (int id, int recuerdo, String nombr, float precio){
        this.id = id;
        this.recuerdo = recuerdo;
        this.nombr = nombr;
        this.precio = precio;
    }
    
    //metodos
    
    public void mostrarVacuna (){
        System.out.println("**********DATOS VACUNAS**********");
        System.out.println("ID" + "\t" + "Recuerdo" + "\t" + "Nombre" + "\t" + "Precio");
        System.out.println("getId()" + "\t" + getRecuerdo() + "\t" + getNombr() + "\t" + getPrecio());
        System.out.println("**********FIN DATOS VACUNAS**********");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecuerdo() {
        return recuerdo;
    }

    public void setRecuerdo(int recuerdo) {
        this.recuerdo = recuerdo;
    }

    public String getNombr() {
        return nombr;
    }

    public void setNombr(String nombr) {
        this.nombr = nombr;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}//llave vacuna
