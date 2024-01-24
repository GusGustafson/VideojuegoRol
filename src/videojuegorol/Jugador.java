package videojuegorol;

/** Clase Jugador
 * 
 * @author Augusto Blanco
 */

public class Jugador {
    
    // Atributos:
    private String nombre;
    private int nivel;
    private int experienciaActual;
    private final int EXPERIENCIA_NECESARIA = 100;
    private Item[][] inventario;
    private Item itemActivo;
    
    // Métodos:
    
    // Constructor de objeto JUGADOR:
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 0;
        this.experienciaActual = 0;
        this.inventario = new Item[2][2];
        if (inventario.length > 0 && inventario[0].length > 0) {
            this.itemActivo = inventario[0][0];
        } else {
            System.out.println("Error: El inventario no tiene items para establecer el item activo por defecto");
            this.itemActivo = null;
        }
    }

    // SETTER del nombre:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // SETTER del nivel:
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // SETTER de la experiencia actual:
    public void setExperienciaActual(int experienciaActual) {
        this.experienciaActual = experienciaActual;
    }
    
    // SETTER del inventario:
    public void setInventario(Item[][] inventario) {
        this.inventario = inventario;
    }
    
    // SETTER del item activo del inventario:
    public void setItemActivo(int filaArray, int columnaArray) {
        if (filaArray >= 0 && filaArray < inventario.length && columnaArray >= 0 && columnaArray < inventario[0].length) {
            this.itemActivo = inventario[filaArray][columnaArray];
        } else {
            System.out.println("Posicion del inventario no valida para establecer el item activo.");
        }
    }

    // GETTER del nombre:
    public String getNombre() {
        return nombre;
    }
        
    // GETTER del nivel:
    public int getnivel() {
        return nivel;
    }
    
    // GETTER de la experiencia actual:
    public int getExperienciaActual() {
        return experienciaActual;
    }
    
    // GETTER de la experiencia necesaria:
    public int getExperienciaNecesaria() {
        return EXPERIENCIA_NECESARIA;
    }
    
    // GETTER del inventario:
    public Item[][] getInventario() {
        return inventario;
    }
    
    // GETTER del item activo:
    public Object getItemActivo() {
        if (itemActivo != null) {
            return itemActivo;
        } else {
            return "Vacio";
        }
    }
        
    // Método Atacar:
    public void atacar(Enemigo en) {
        int aux = en.getExperiencia() + this.experienciaActual;
        int niveles = aux / EXPERIENCIA_NECESARIA;
        nivel += niveles;
        experienciaActual = aux % EXPERIENCIA_NECESARIA;
    }
}
