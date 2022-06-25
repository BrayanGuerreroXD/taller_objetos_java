import java.util.ArrayList;

/**
 * Representa una fruta con sus respectivos atributos.
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Fruit {
    /**
     * Representa la variable que almacena el nombre de la fruta.
     */
    public String name;
    /**
     * Representa la variable que almacena el peso promedio de la fruta.
     */
    private float averageWeight;
    /**
     * Representa la variable que almacena el listado de colores que tiene la fruta.
     */
    public ArrayList<String> colors;

    /**
     * Representa una instancia de la clase Fruit.
     * @param name nombre de la fruta.
     * @param averageWeight peso promedio de la fruta.
     * @param colors lista de colores que tiene la fruta.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Función que retorna el nombre de la fruta.
     * @return nombre.
     */
    public String getName() {
        return name;
    }

    /**
     * Función que almacena el nombre de la fruta.
     * @param name nombre.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Función que retorna el peso promedio de la fruta.
     * @return peso promedio.
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Función que retorna el listado de colores que tiene la fruta.
     * @return colores
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Función que almacena el listado de colores de la fruta.
     * @param colors colores.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
