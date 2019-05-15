package estructurasdedatos.cap2.arreglos;

public class Vector {
       
    int vector [];
    int tam;
    
    public void Vector (int t){
        
        this.tam = t;
        this.vector = new int [this.tam];
    }
    
    public void setTam(int t){
        
        this.tam=t;
    }
    
    public int getTam (){
        
        return tam;      
    }
    
    public boolean eliminar (int dato){
        
       this.vector = null;
       return true;
    }
    
    public void insertar (int dato, int pos){
        
        this.vector [pos]=dato;        
    }
    
    public void listar(){
        
        for (int l=0; l<tam;l++){
            System.out.println ("La posicion solicitada es" +vector[l]);
        }
    }
        
    public void ordenar(){
        
        int aux=0;
        for(int i=0;i<tam-1;i++){
            for(int j=i+1;j<tam;j++){
                aux=vector[i];
                vector[i]=vector[j];
                vector[j] = aux;
            }
          }
        }
    
    public void searchBinario(int pos){
        
        int posini=0;
        int posfinal=vector.length-1;
        int poscentro;
        
        while(posini<=posfinal){         
            poscentro=(posfinal+posini)/2;
            
            if (vector[poscentro]==pos){              
                System.out.println("El dato esta en " + posini + "y"+posfinal);               
            }
            
            else if(pos<vector[poscentro]){
                posfinal=poscentro+1;
                
            }
            
         }
        
      }
    
    public void actualizar(int pos, int dato){
        
        if((pos<tam)&&(pos>0)){
            this.vector[pos]=dato;
        }
            else{
                    System.out.println("El tamaño no es correcto");
                    }           
        }
    
    public void borrar(int pos){
        
        if((pos<tam)&&(pos>0)){
            this.vector[pos] = 0;       
                }
        
        else{
            System.out.println("Tamaño incorrecto baby");
         }
       }

    }