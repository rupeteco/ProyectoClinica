package proyectoclinica;

import java.util.*;

public class VacunaPerro {
    private Calendar fecha;
    Vacuna vacuna = null;//tenemos solo una vacuna 
    
    //constructor
    
    VacunaPerro (){}
    
    VacunaPerro (Calendar fecha, int hora){
        this.fecha = fecha;
        this.hora = hora;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public ArrayList<Vacuna> getFechavacuna() {
        return fechavacuna;
    }

    public void setFechavacuna(ArrayList<Vacuna> fechavacuna) {
        this.fechavacuna = fechavacuna;
    }

       
    
}//llave vacunaperro
