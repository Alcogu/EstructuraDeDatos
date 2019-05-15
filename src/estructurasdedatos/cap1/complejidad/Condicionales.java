package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;


public class Condicionales {
    
    public void ejercicioscondicionales(){
    
    Scanner datos = new Scanner(System.in);
    
    int eleccion;
       
    eleccion = datos.nextInt();
    
    switch(eleccion){
        
        case 5:   
            
            Scanner dato = new Scanner(System.in);
            int v1= dato.nextInt();
            
            int v2=v1-1;
            
            while ((v1&v2)!=0){
                v2--;
            }
            
            if(v2==1){
                System.out.println("Si es primo");}
            else{
                System.out.println("No es primo");
        }
            break;
        
        case 6: 
            
            int i=5;
        
            if ((i % 2)==0) {
                System.out.println("es par");
       }
                else{
                System.out.println("no es impar");  
                        }
            
            break;
            
            case 7: 
                
            int p=4;
        
            if ((p % 2)!=0) {
                
                System.out.println("es par");
       }
                else{
                System.out.println("no es impar");  
                        }
            
            break;
        
            
       }
    }
}