package estructurasdedatos.utiles.nodos;

public class NodoArbolB {
    
        private NodoArbolB ladod;
        private NodoArbolB ladoi;
        private NodoArbolB raiz;
        private int dato;

        public void NodoArbolB() {
            
            this.setLadod(null);
            this.setLadoi(null);
            this.setDato(0);
            
        }
        
    public int getDato() {
        return dato;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbolB getLadod() {
        return ladod;
    }

    public void setLadod(NodoArbolB ladod) {
        this.ladod = ladod;
    }
    public NodoArbolB getLadoi() {
        return ladoi;
    }
    public void setLadoi(NodoArbolB ladoi) {
        this.ladoi = ladoi;
    }
    
    public NodoArbolB getRaiz() {
        return raiz;
    }

    void setDato(NodoArbolB raiz) {
        this.raiz = raiz;
    }

}