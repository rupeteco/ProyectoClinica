package proyectoclinica;

import java.util.*;

public class Perro {
    
   private String nombre;
   private String raza;  
   private Calendar fechaProxVac;
   ArraysList <VacunaPerro> vacunasFecha = new ArraysList <VacunaPerro> ();
    
    //constructor
    
    Perro(){}
    
    Perro (String nombre, String raza, Calendar fechaProxVac){
        this.nombre = nombre;
        this.raza = raza;
        this.fechaProxVac = fechaProxVac;
    }
    
    //metodos
    
    public void mostrarPerro (){
        System.out.println("Nombre" + "\t"  + getNombre());
        System.out.println("Raza" + "\t" + getRaza());
        System.out.println("FechaProxima" + "\t" + getFechaProxVac());
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Calendar getFechaProxVac() {
        return fechaProxVac;
    }

    public void setFechaProxVac(Calendar fechaProxVac) {
        this.fechaProxVac = fechaProxVac;
    }

    public ArraysList<VacunaPerro> getVacunas() {
        return nombrevacuna;
    }

    public void setVacunas(ArraysList<VacunaPerro> vacunas) {
        this.nombrevacuna = vacunas;
    }

   
}//llave clase perro
