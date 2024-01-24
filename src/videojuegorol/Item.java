package videojuegorol;

/** Clase Item
 * 
 * @author Augusto Blanco
 */

public class Item {
    
    // Atributos:
    private String nombre;
    private String descripcion;
    
    // Métodos:
    
    // Constructor:
    public Item (String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    // SETTER del nombre:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // GETTER del nombre:
    public String getNombre() {
        return nombre;
    }
    
    // SETTER de la descripción:
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // GETTER de la descripción:
    public String getDescripcion() {
        return descripcion;
    }

    // Representación del objeto:
    @Override
    public String toString() {
        return nombre + "-" + descripcion;
    }    
}
