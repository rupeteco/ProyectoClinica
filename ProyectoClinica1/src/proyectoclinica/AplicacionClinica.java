package proyectoclinica;

import java.util.Scanner;
import java.util.Calendar;
import java.util.*;

public class AplicacionClinica {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        Clinica c;
        Perro p;
        VacunaPerro vc;
        Vacuna v ;
        //variable clase Clinica
        String nomb;
        //variables clase Perro
        String nombre;
        String raza;  
        Calendar fechaProxVac;
        //variables clase Vacuna
        int id;
        int recuerdo;
        String nombr;
        float precio;
        int opcion;
        
        
        do {
            mostrarMenu();
            
            System.out.println("Elige una opción:");
            opcion = teclado.nextInt(); 
            
            switch (opcion){
                
                case 1:
                    teclado.nextLine(); //limpiar buffer
                    System.out.println("Introduce el nombre de la clínica veterinaria:");
                    nomb = teclado.nextLine ();
        
                    c = new Clinica (nomb);
        
                    System.out.println("Se ha creado la clinica con éxito:");
                    System.out.println("**********************************");
                    System.out.println("Nombre de la clínica: " + c.getNomb());
                    System.out.println("**********************************");
                    break;
                
                case 2:
                    
                    System.out.println("Introduce el id:");
                    id = teclado.nextInt();
                    
                    teclado.nextLine(); //limpiar buffer
                    System.out.println("Introduce la vacuna de recuerdo:");
                    recuerdo = teclado.nextInt();
                    
                    teclado.nextLine();//limpiar buffer
                    System.out.println("Introduce el nombre de la vacuna:");
                    nombr = teclado.nextLine();
                    
                    System.out.println("Dime el precio de la vacuna:");
                    precio = teclado.nextFloat();
                    
                    v = new Vacuna (id,recuerdo,nombr,precio);
                    
                    System.out.println("Se ha dado de alta a la vacuna con éxito:");
                    System.out.println("**********************************");
                    System.out.println("ID de la vacuna " + v.getId());
                    System.out.println("Nombre vacuna recuerdo: " + v.getRecuerdo());
                    System.out.println("Nombre de la vacuna: " + v.getNombr());
                    System.out.println("Precio de la vacuna: " + v.getPrecio());
                    System.out.println("**********************************");
                    break;
                    
                case 3:
                    System.out.println("Introduce el nombre del perro:");
                    nombre = teclado.nextLine();
                    
                    System.out.println("Introduce la raza del perro:");
                    raza = teclado.nextLine();
                    
                    System.out.println("Introduce la fecha de la próxima vacunación");
                    //fechaProxVac = teclado.
                    
                  //  p = new Perro (nombre, raza, fechaProxVac);
                   // p.mostrarPerro();
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    break;
                    
                case 9:
                    break;
                    
                default:
                    System.out.println("HAS ELEGIDO UNA OPCION INCORRECTA");
                    break;
            
            }//llave switch
        } while (opcion != 9);   
    }//llave main
    
    public static void mostrarMenu(){
        System.out.println("1.- Dar alta de la clínica veterinaria");
        System.out.println("2.- Dar alta de las vacunas");
        System.out.println("3.- Dar de alta a un perro");
        System.out.println("4.- Vacunar a un perro");
        System.out.println("5.- Listado de vacunas de un perro");
        System.out.println("6.- Cambiar fecha de la próxima vacunación de un perro determinado");
        System.out.println("7.- Listado de todos los perros que están vacunados de una determinada vacuna");
        System.out.println("8.- Listado de los perros que se tienen que vacunar en un mes determinado");
        System.out.println("9.- Salir");
    }
    
}//llave clase clinica
