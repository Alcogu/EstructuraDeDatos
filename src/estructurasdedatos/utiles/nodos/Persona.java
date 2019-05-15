
package estructurasdedatos.utiles.nodos;

public class Persona {
    private String nombre;
    private String telefono;
    private String ceula;
    
    public void crearPerssona(String nombre, String telefono, String cedula){
        System.out.println("creando persona");
    }
    
    public void modificarPersona(String nombre, String telefono, String cedula){
        System.out.println("Modificando persona");
    }

    public String getNombre() {
        return "Mi nombre es " + nombre ;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCeula() {
        return ceula;
    }
    public void setCeula(String ceula) {
        this.ceula = ceula;
    }

}
