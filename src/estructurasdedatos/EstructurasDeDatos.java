package estructurasdedatos;

import estructurasdedatos.cap1.complejidad.*;
import estructurasdedatos.cap2.arreglos.*;
import ventanasGraficas.VentanaPrincipal;

public class EstructurasDeDatos {
    public static void main(String[] args) {
        
    new VentanaPrincipal().setVisible(true);
    
    System.out.println("Elija una de las opciones");
    
    System.out.println("Ciclos");
    System.out.println("1 para los numeros del 1 al 100");
    System.out.println("2 para los numeros del 100 al 1");
    System.out.println("3 para los numeros pares");
    System.out.println("4 para los numeros impares");
    
    System.out.println("Condicionales");
    System.out.println("5 Numero primos");
    System.out.println("6 para para los numeros del 100 al 1");
    System.out.println("7 para los numeros pares");
    
    
        Condicionales ejercicioscondicionales = new Condicionales();
        ejercicioscondicionales.ejercicioscondicionales();
        
        Ciclos ejerciciosciclos = new Ciclos();
        ejerciciosciclos.ejerciciosciclos();
 
    }
    
}