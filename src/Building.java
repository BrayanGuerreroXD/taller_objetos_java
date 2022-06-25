/**
 * Representa una construcción con sus respectivos atributos.
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Building {
    private String code;
    protected String address;
    public String color;
    public String type;

    /**
     * Representa una instancia de la clase Building.
     * @param code código de la obra.
     * @param address dirección de la obra.
     * @param color color de la obra.
     * @param type tipo de obra.
     */
    public Building(String code, String address, String color, String type) {
        this.code = code;
        this.address = address;
        this.color = color;
        this.type = type;
    }

    /**
     * Función que retorna el código de la obra.
     * @return código.
     */
    private String getCode() {
        return code;
    }

    /**
     * Función que retorna la dirección donde se encuentra ubicada la obra.
     * @return dirección.
     */
    protected String getAddress() {
        return address;
    }

    /**
     * Función que retorna el tipo de obra construida.
     * @return tipo de obra.
     */
    public String getType() {
        return type;
    }

    /**
     * Función que retorna el color de la obra.
     * @return color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Función que almacena el color de la obra.
     * @param color color de la obra.
     */
    public void setColor(String color) {
        this.color = color;
    }
}
