package estructurasdedatos.utiles.nodos;

public class NodoSimple {
    
    private NodoSimple siguiente;
    private int dato;

    
    public NodoSimple  getSiguiente() {
        return siguiente;
    }

  
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

  
    public int getDato() {
        return dato;
    }

 
    public void setDato(int dato) {
        this.dato = dato;
    }

    public void crearnodo() {
        this.siguiente = null;
        this.dato = 0;

    }

    public void setDato(String nombre, String fecha, String responsable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDato(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

