package proyectoclinica;

public class Vacuna {
    
    private int id;
    private String recuerdo;
    private String nombr;
    private float precio;
    
    //constructor
    
    Vacuna (){}
    
    Vacuna (int id, String recuerdo, String nombr, float precio){
        this.id = id;
        this.recuerdo = recuerdo;
        this.nombr = nombr;
        this.precio = precio;
    }
    
    //metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecuerdo() {
        return recuerdo;
    }

    public void setRecuerdo(String recuerdo) {
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
