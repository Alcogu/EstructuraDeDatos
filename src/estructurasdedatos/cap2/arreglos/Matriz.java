package estructurasdedatos.cap2.arreglos;

public class Matriz {
    
    int filas;
    int columnas;
    int matriz [][] = new int [filas][columnas];
    
    public void Matriz (int nfilas, int ncolumnas){
        this.filas = nfilas;
        this. columnas=ncolumnas;
        this.matriz = new int [filas][columnas];
    }
    
    public void insertar (int nfilas, int ncolumnas, int dato){
        
        this.filas= nfilas;
        this. columnas= ncolumnas;
        this.matriz [filas] [columnas] =dato;
    }
    
    public void eliminar (int nfilas, int ncolumnas, int dato){
        
        this.filas= nfilas;
        this. columnas= ncolumnas;
        this.matriz [filas] [columnas] =0;
        
    }
    
    public void buscar (int dato){
        
        for(int b=0;b<matriz.length; b++){
            for(int bd=0;bd<matriz.length; bd++){
                
                if(this.matriz [b][bd]==dato){
                    System.out.println("El valor esta en la posicion "+b +bd);
                }                
            }            
        }        
    }
    
    public void listar (){
        
        for(int a=0;a<matriz.length; a++){
            for(int v=0;v<matriz[a].length; v++){
                
                System.out.println(matriz [a][v]);
                System.out.println("Se lista");
                }
            }
        }         
    }