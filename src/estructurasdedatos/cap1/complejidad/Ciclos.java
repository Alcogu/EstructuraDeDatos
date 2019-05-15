package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

public class Ciclos {
    
    public void ejerciciosciclos(){
    
    Scanner datos = new Scanner(System.in);
    
    int eleccion;
    eleccion = datos.nextInt();
    
    switch(eleccion){
        case 1:
        
            for (int i=1; i<=100; i++)
                System.out.println("Los numero del 1 al 100 son:"+i);
        
            break;
        
        case 2:
            
            for (int i=1; i>=100; i++)
                System.out.println("Los numero del 100 al 1 son:"+i);
        
            break;
        
        case 3:
            int i = 0;
            while (i<=10){
                System.out.println("Los numero pares son:"+i);
                    i=i+2;
            }
            break;
    
        case 4:
            int j = 1;
            while (j<=10){   
                System.out.println("Los numero pares son:"+j);
                j=j+2;
            }
            break;
            
       }
    }
}