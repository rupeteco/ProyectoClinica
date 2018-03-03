package proyectoclinica;

import java.util.*;

public class Clinica {
    
    String nomb;
    ArrayList <Perro> perros = new ArrayList <Perro> ();
    ArrayList <Vacuna> vacunas = new ArrayList <Vacuna> ();
    
    //Constructor
    
    Clinica (){}

    Clinica(String nomb) {
        this.nomb = nomb;
    }
    
    //metodos
    
    public void mostrarClinica (){
        System.out.println("**********DATOS CLINICA**********");
        System.out.println("Nombre");
        System.out.println(getNomb());
        System.out.println("**********FIN DATOS CLINICA**********");
    }
    
    public void mostrarListaPerros (){
        for (int i = 0;i < this.perros.size();i++){
            this.perros.get(i).mostrarPerro();
        }
    }
    
    public void mostrarListaVacunas (){
        for (int i = 0; i < this.vacunas.size(); i++){
            this.vacunas.get(i).mostrarVacuna();
        }
    }
    
     public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(ArrayList<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }
}//llave clinica
