package estructurasdedatos.cap2.listas;

public class Cola {

    private NodoPersona dato;
    private NodoPersona tope;
    private NodoPersona ultimo;

    public void crcola() {
        tope = ultimo = null;
    }

    public boolean vacia() {
        return (this.tope == null);
    }

    public void encolar(int cedula) {
        NodoPersona nuevo = new NodoPersona();
        nuevo.setDato(cedula);
        if (vacia()) {
            this.tope = nuevo;
            this.ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }

    }

    public void evacuar() {
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            tope = tope.getSiguiente();

        }
    }

    public void listar() {
        NodoPersona aux = tope;

        System.out.println("");
        int i = 0;
        while (aux != null) {
            System.out.println(i + "." + " [ " + aux.getDato().getCedula() + " ]");

            aux = aux.getSiguiente();
            i++;
        }

    }

    public int desde() {
        NodoPersona aux = tope;
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();

        }
        return contador;

    }

 
    public NodoPersona getDato() {
        return dato;
    }

 }