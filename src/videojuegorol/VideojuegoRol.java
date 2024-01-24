package videojuegorol;

import java.util.Arrays;

/** Clase ejecutable principal
 * 
 * @author Augusto Blanco
 */
public class VideojuegoRol {
    
    /**
     * 
     * @param args Array de argumentos
     */
    public static void main(String[] args) {
        
        // Instanciar un objeto JUGADOR (personaje):
        Jugador j1 = new Jugador("Jugador_1");
        
        // Instanciar un objeto ENEMIGO:
        Enemigo e1 = new Enemigo("Enemigo_1", 120);
        
        // Instanciar un item (repetimos 1 vez para rellenar el siguiente hueco del array del inventario):
        Item i1 = new Item("Item_1", "Desc_1");
        Item i2 = new Item("Item_2", "Desc_2");
        // Trasladar los 2 items creados al array del inventario:
        Item[][] array = new Item[2][2];
        array[0][0] = i1;
        array[0][1] = i2;
        j1.setInventario(array);
        
        // Definir el item activo del inventario:
        j1.setItemActivo(0, 1);
        
        // Mostrar datos de los objetos:
        System.out.println("JUGADOR: " + j1.getNombre() + ", "
                            + "NIVEL: " + j1.getnivel() + ", "
                            + "EXPERIENCIA: " + j1.getExperienciaActual() + ", "
                            + "INVENTARIO: " + mostrarInventario(j1.getInventario()) + ", "
                            + "ITEM ACTIVO: " + j1.getItemActivo());
        System.out.println("ENEMIGO: " + e1.getNombre() + ", "
                            + "EXPERIENCIA OTORGADA: " + e1.getExperiencia());
        
        // El jugador ataca al enemigo, gana el combate y sube de nivel:
        j1.atacar(e1);
        System.out.println("El jugador ataca al enemigo, gana el combate y sube de nivel.");
        
        // Volvemos a mostrar los datos del objeto JUGADOR:
        System.out.println("JUGADOR: " + j1.getNombre() + ", "
                            + "NIVEL: " + j1.getnivel() + ", "
                            + "EXPERIENCIA: " + j1.getExperienciaActual() + ", "
                            + "INVENTARIO: " + mostrarInventario(j1.getInventario()) + ", "
                            + "ITEM ACTIVO: " + j1.getItemActivo());
    }
    
    // Clase para mostrar el inventario completo:
    public static String mostrarInventario(Item[][] inventario) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                if (inventario[i][j] != null) {
                    resultado.append(inventario[i][j]).append(" ");
                } else {
                    resultado.append("Vacio").append(" ");
                }
            }
        }
        return resultado.toString();
    }
}
