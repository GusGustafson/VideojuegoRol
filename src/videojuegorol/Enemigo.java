package videojuegorol;

/** Clase Enemigo
 * 
 * @author Augusto Blanco
 */

public class Enemigo {
    
    // Atributos:
    private String nombre;
    private int experienciaOtorgada;
    
    // Métodos:
    
    // Constructor:
    public Enemigo(String nombre, int experienciaOtorgada) {
        this.nombre = nombre;
        this.experienciaOtorgada = experienciaOtorgada;
    }
    
    // SETTER del nombre:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // GETTER del nombre:
    public String getNombre() {
        return nombre;
    }
    
    // SETTER de la experiencia:
    public void setExperiencia(int experiencia) {
        this.experienciaOtorgada = experiencia;
    }
    
    // GETTER de la experiencia:
    public int getExperiencia() {
        return this.experienciaOtorgada;
    }
}
