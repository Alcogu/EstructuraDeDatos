package estructurasdedatos.cap4.arboles;

import estructurasdedatos.utiles.nodos.*;

public class ArbolBDos {
    
    private NodoArbolBdos raiz;
    
    public ArbolBDos( int valor ) {
        this.raiz = new NodoArbolBdos( valor );
    }
 
    public ArbolB2( NodoArbolBdos raiz ) {
        this.raiz = raiz;
    }
 
 
    public NodoArbolBdos getRaiz() {
        return raiz;
    }
 
    public void setRaiz(NodoArbolBdos raiz) {
        this.raiz = raiz;
    }
             
  
    private void Insertar( NodoArbolBdos nodo, NodoArbolBdos raiz ) {
        
        if ( raiz == null ) {
            
            this.setRaiz(nodo);
        }
        else {           
            if ( nodo.getValor() <= raiz.getValor() ) {              
                if (raiz.getladoI() == null) {
                    raiz.setladoI(nodo);
                }
                else {
                    Insertar( nodo , raiz.getladoI() );
                }
            }
            else {              
                if (raiz.getladoD() == null) {
                    raiz.setladoD(nodo);
                }
                else {
                    Insertar( nodo, raiz.getladoD() );
                }
            }
        }
    }
    
     public boolean Buscar(NodoArbolBdos dato, NodoArbolBdos raiz){
            boolean respuesta = false;
            if(raiz == null){
                System.out.println("Sin datos");
            } else {
                if(dato == raiz.dato){
                    respuesta = true;
                    return true;
                }else{
                    if(dato < raiz.getDato()){
                        respuesta(raiz.getladoI().dato);
                    }else{
                        if(dato > raiz.getDato()){
                        respuesta(raiz.getladoD().dato);
                    }
                }
           }
            
            return respuesta;
        }
           return false;
       
     }

     public int AlturaArbol(){
            if(raiz!= null){
                return 0;
            }else{
                int ladoi=raiz.ladoI.AlturaArbol();
                int ladod=raiz.ladoD.AlturaArbol();
                return (1+Math.max(ladoi, ladod));
            }
        }
    


   public void orden(NodoArbolBdos raiz){
            if(raiz!= null){
                orden(raiz.getladoI());
                System.out.print(raiz.getDato() + ",");
                orden(raiz.getladoD());
            }
        }
  
  
    public void preorden(NodoArbolBdos raiz){
            if(raiz!= null){
                System.out.print(raiz.getDato() + ",");
                preorden(raiz.getladoI());
                preorden(raiz.getladoD());
            }
        }
       
           
     public void postorden(NodoArbolBdos raiz){
            if(raiz!= null){
                postorden(raiz.getladoI());
                postorden(raiz.getladoD());
                System.out.print(raiz.getDato() + ",");
            }
        }  

}