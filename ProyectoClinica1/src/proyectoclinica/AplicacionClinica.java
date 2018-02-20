package proyectoclinica;

import java.util.Scanner;
import java.util.Calendar;

public class AplicacionClinica {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        Perro p;
        Clinica c;
        Vacuna v ;
        String nombre;//variable clase Perro
        String raza;//variable clase Perro  
        Calendar fechaProxVac;//variable clase Perro
        String nomb;//variable clase Clinica
        int id;//variable clase Vacuna
        String recuerdo;//variable clase Vacuna
        String nombr;//variable clase Vacuna
        float precio;//variable clase Vacuna
        int opcion;
        
        do {
            mostrarMenu();
            
            System.out.println("Elige una opción:");
            opcion = teclado.nextInt(); 
            
            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre del perro:");
                    nombre = teclado.nextLine();
                    
                    System.out.println("Introduce la raza del perro:");
                    raza = teclado.nextLine();
                    
                    System.out.println("Introduce la fecha de la próxima vacunación");
                    fechaProxVac = teclado.
                    
                    p = new Perro (nombre, raza, fechaProxVac);
                    p.mostrarPerro();
                    break;
                    
                case 2:
                    break;
            
            }//llave switch
        } while (opcion != 2);   
    }//llave main
    
    public static void mostrarMenu(){
        System.out.println("1.-");
    
    }
    
}//llave clase clinica
