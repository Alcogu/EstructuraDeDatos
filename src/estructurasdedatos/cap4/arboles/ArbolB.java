package estructurasdedatos.cap4.arboles;

import estructurasdedatos.utiles.nodos.*;

public class ArbolB{
  
    private NodoArbolB raiz;

        public boolean vacio() {
            return raiz == null;
        }

        
    public void Insertar(NodoArbolB raiz) {
        
            if (raiz!= null) {
                
                NodoArbolB nuevonodo = new NodoArbolB();
                
                nuevonodo.setDato(raiz);
                nuevonodo.setLadod(new NodoArbolB());
                nuevonodo.setLadoi(new NodoArbolB());
                
           }else
            {
                if(raiz > raiz.getDato()){
                    raiz.getLadod().Insertar(NodoArbolB);
                }
                if(NodoArbolB < raiz.getDato()){
                    raiz.getLadoi().Insertar(NodoArbolB);
                }
            }
        }       
       
        
    public ArbolB Buscar(int nodo){
            ArbolB arbolinferior = null;
            if(raiz!= null){
                if(nodo == raiz.getDato()){
                    return this;
                }else{
                    if(nodo < raiz.getDato()){
                        arbolinferior=raiz.getLadoi().Buscar(nodo);
                    }else{
                        arbolinferior=raiz.getLadod().Buscar(nodo);
                    }
                }
            }
            
            return arbolinferior;
        }
       
    
    public int buscarMen() {
        ArbolB arbolActual = this;
        while(arbolActual.raiz.ladoi.vacio() ) {
            arbolActual = arbolActual.raiz.getLadoi();
        }
        int back= arbolActual.raiz.getDato();
        arbolActual.raiz=null;
        return back;

    }
 

    public int buscarMay() {
        ArbolB arbolActual = this;
        while( !arbolActual.raiz.ladod.vacio() ) {
            arbolActual = arbolActual.raiz.getLadod();
        }
        int back= arbolActual.raiz.getDato();
            arbolActual.raiz=null;
        return back;
    }
     
    
    public int AlturaArbol(){
            if(raiz!= null){
                return 0;
            }else{
                int ladoi=raiz.getLadoi().AlturaArbol();
                int ladod=raiz.getLadod().AlturaArbol();
                return (1+Math.max(ladoi, ladod));
            }
        }
            
   public void orden(NodoArbolB raiz){
            if(raiz!= null){
                orden(raiz.getLadoi());
                System.out.print(raiz.getDato() + ",");
                orden(raiz.getLadod());
            }
        }
   
   
    public void preorden(NodoArbolB raiz){
            if(raiz!= null){
                System.out.print(raiz.getDato() + ",");
                preorden(raiz.getLadoi());
                preorden(raiz.getLadod());
            }
        }
        
            
     public void postorden(NodoArbolB raiz){
            if(raiz!= null){
                postorden(raiz.getLadoi());
                postorden(raiz.getLadod());
                System.out.print(raiz.getDato() + ",");
            }
        }   
}