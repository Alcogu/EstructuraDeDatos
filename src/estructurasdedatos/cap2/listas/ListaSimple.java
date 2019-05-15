package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoSimple;


public class ListaSimple {

    private NodoSimple ini;
    private NodoSimple fin;
    public void CrearListaSimple() {

        this.ini = null;
        this.fin = null;

    }
    
     public void listar() {

        if (!(this.ini == null && this.fin == null)) {

            NodoSimple aux = ini;

            int a = 0;
            while (aux != null) {
             System.out.println("El valor :" + "[" + aux.getDato() + "]" + " " + "esta hubicado en la posicion" + "(" + a + ")" + "de la lista");
              aux = aux.getSiguiente();
                a++;
            }
        }

    }

    public void insertar(int dato) {
        NodoSimple nodoS = new NodoSimple();
        nodoS.crearnodo();
        nodoS.setDato(dato);
        if (this.ini == null && this.fin == null) {

            this.ini = nodoS;
            this.fin = nodoS;

        } else {
            fin.setSiguiente(nodoS);
            this.fin = nodoS;

        }
    }

    public void eliminar(int dato) {
        
        if (ini.getDato() == dato) {
            ini = ini.getSiguiente();
        } 
        
        else {
            
            NodoSimple aux = ini;
            
            while (aux.getSiguiente().getDato() != dato) {
                
                aux = aux.getSiguiente();
                
            }
            
            NodoSimple siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
            
        }

    }
}