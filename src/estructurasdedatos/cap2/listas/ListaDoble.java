package estructurasdedatos.cap2.listas;
import estructurasdedatos.utiles.nodos.NodoDoble;

public class ListaDoble {
    
    private NodoDoble ini;
    private NodoDoble fin;
    
    public void crearListaDoble() {
        
        this.ini = null;
        this.fin = null;
    }
 
    public void insertar(int dato) {
        
        NodoDoble nod = new NodoDoble();
        nod.crearnodoListadoble();
        nod.setDato(dato);
        NodoDoble aux = ini;
        
        if (this.ini == null && this.fin == null) {
            
            this.ini = nod;
            this.fin = nod;
            
        } else if (nod.getDato() < aux.getDato() && aux.getSiguiente() == null) {
            
            nod.setSiguiente(aux);
            nod.setAnterior(this.ini);
            this.ini =nod;  
            
        }
    }

    public void listarDoble() {
        
        if (!(this.ini == null && this.fin == null)) {
            NodoDoble aux = fin;
            int i = 0;
            
            while (aux != null) {   
                System.out.println("El valor :" + "[" + aux.getDato() + "]" + " " + "esta hubicado en la posicion:"
                        + " (" + i + ")");
                aux = aux.getSiguiente();  
                i++;
            }
        }
    }

    public void eliminarDoble(int dato) {

        if (ini.getDato() == dato) {
            ini = ini.getSiguiente();
            
        } else {
            NodoDoble aux = ini;
            while (aux.getSiguiente().getDato() != dato) {
                aux = aux.getSiguiente();
                
            }
            
            NodoDoble siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);  
            
        }
    }

    public void insertarFinal(int dato) {

    NodoDoble nodito = new NodoDoble();
    nodito.crearnodoListadoble();
    nodito.setDato(dato);
    
    if (this.ini == null && this.fin == null) {
        ini = nodito;
        fin = nodito;
        
    } else {
        
        NodoDoble aux = ini;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();

            }
            aux.setSiguiente(nodito);  
            nodito.setAnterior(aux);
        }
    }
    
    public void setActualizar (int nuevoDato,int buscar){
        
            NodoDoble aux= new NodoDoble();
            aux=ini;
        
        while((aux!=null)&&(!aux.getDato().equals(buscar))){
            aux=aux.getSiguiente();
    
        }
        
        aux.setDato(nuevoDato);
    
    }
    
    
}
