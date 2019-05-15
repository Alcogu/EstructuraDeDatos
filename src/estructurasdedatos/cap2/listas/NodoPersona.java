package estructurasdedatos.cap2.listas;


public class NodoPersona {
    private persona dato;
    private NodoPersona siguiente;
    
    
    public void crearnodo(){
    siguiente=null;
    dato=null;
}


    public persona getDato() {
        return dato;
    }

    public NodoPersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }    

    void setDato(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}