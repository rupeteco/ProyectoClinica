package proyectoclinica;

import java.util.*;

public class Clinica {
    
    String nomb;
    ArraysList <Perro> perros = new ArraysList <Perro> ();

    
    //Constructor
    
    Clinica (){}

    Clinica(String nomb) {
        this.nomb = nomb;
    }
    
    //metodos
    
     public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public ArraysList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArraysList<Perro> perros) {
        this.perros = perros;
    }
}//llave clinica
