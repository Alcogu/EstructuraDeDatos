package estructurasdedatos.cap3.mapas;

public class Diccionario {
    
    private TablaHash[] Diccionario;
    private TablaHash dato;
    private int tamaño;

    public void createVector(int t) {
        this.tamaño = t;
        this.Diccionario = new TablaHash[tamaño];
    }

    public int funcion(int valor) {
        int vect[] = new int[10];
        int num = valor;
        int pos;
        
        
            for (int i = 0; i < 10; i++) {
                int rest = num % 10;
                num = num / 10;
                vect[i] = rest;
        }
            
            pos = vect[0] + vect[1] + vect[2];
            pos = pos * pos;
        
        
        if (this.Diccionario[pos] == null) {
            return pos;
            
        } else {
            
            while (this.Diccionario[pos] != null) {
                if (pos < this.tamaño) {
                    pos = pos + 1;
                    
                } else {
                    
                    pos = 0;
                }
            }
            return pos;
        }
    }

    public boolean insertar(int llave, String valor) {
        TablaHash nuevo = new TablaHash();
        nuevo.setLlave(llave);
        nuevo.setValor(valor);
        int posicion = this.funcion(llave);
        this.Diccionario[posicion] = nuevo;
        return true;
    }

    public void listar() {

        for (int i = 0; i < tamaño; i++) {
            if (this.Diccionario[i] != null) {
                System.out.println("El dato " + this.Diccionario[i].getLlave()+ " esta en la posicion " + i + " de la tabla hash");
            }
        }
    }

    public void buscar(int dato) {
        if (Diccionario[1].getLlave() == dato) {
            System.out.println("el dato " + dato + " esta en la posicion " + "1");
        } else {
            int i = 0;
            while (i < tamaño) {
                if (Diccionario[1].getLlave() == dato) {
                    System.out.println("el dato" + dato + "esta en la posicion " + i);
                }
                i++;
            }
        }
    }

    public void eliminarPosicion(int pos) {
        Diccionario[pos] = null;
        System.out.println("el dato de la posicion " + pos + " ha sido eliminada");
    }
    
    
}