package estructurasdedatos.cap2.listas;


public class Actividad {

    private String tipo;
    private float porcentaje;

    public Actividad(String tipo) {
        this.tipo = tipo;
        
    }

  
    public String getTipo() {
        return tipo;
    }


    public void setipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPorsentaje() {
        return porcentaje;
    }


    public void setPorsentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
}