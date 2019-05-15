package estructurasdedatos.utiles.nodos;

public class NodoArbolBdos {
    
    
    private int valor; 
    
    public NodoArbolBdos ladod;
    public NodoArbolBdos ladoi;
    public NodoArbolBdos dato;
 
   
    
    public NodoArbolBdos(int valor) {
        this.valor = valor;
    }
 
   
    public void setValor(int valor) {
        this.valor = valor;
    }
 
    public int getValor() {
        return valor;
    }
 
    public NodoArbolBdos getDato() {
        return dato;
    }
 
    public void setdato(NodoArbolBdos dato) {
        this.dato = dato;
    }
 
    public NodoArbolBdos getladoI() {
        return ladoi;
    }
 
    public void setladoI(NodoArbolBdos ladoI) {
        this.ladoi = ladoi;
    }
 
    public NodoArbolBdos getladoD() {
        return ladod;
    }
 
    public void setladoD(NodoArbolBdos ladoD) {
        this.ladod = ladod;
    }

    int AlturaArbol() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
}