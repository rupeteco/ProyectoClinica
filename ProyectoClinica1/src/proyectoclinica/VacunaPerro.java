package proyectoclinica;

import java.util.*;

public class VacunaPerro {
    private int  fecha;
    private int hora;
    ArrayList <Vacuna> listavacunas = new ArrayList <Vacuna> ();  
    
    //constructor
    
    VacunaPerro (){}
    
    VacunaPerro (int fecha,int hora){
        this.fecha = fecha;
        this.hora = hora;
    }
    
    //metodos
    
    public void mostrarListaVacunas (){
        for (int i = 0; i < this.listavacunas.size(); i++){
            this.listavacunas.get (i).mostrarVacuna();
        }
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public ArrayList<Vacuna> getListavacunas() {
        return listavacunas;
    }

    public void setListavacunas(ArrayList<Vacuna> listavacunas) {
        this.listavacunas = listavacunas;
    }
}//llave vacunaperro
