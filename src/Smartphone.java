/**
 * Representa un smartphone con sus respectivos atributos.
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Smartphone {
    private int ip;
    protected String model;
    public String brand;
    public String name;

    /**
     * Representa una instancia de la clase Smartphone.
     * @param ip número ip.
     * @param model código del modelo.
     * @param brand marca.
     * @param name nombre.
     */
    public Smartphone(int ip, String model, String brand, String name) {
        this.ip = ip;
        this.model = model;
        this.brand = brand;
        this.name = name;
    }

    /**
     * Función que retorna el número ip del smartphone.
     * @return número ip.
     */
    private int getIp() {
        return ip;
    }

    /**
     * Función que retorna el código del modelo del smartphone.
     * @return código del modelo.
     */
    protected String getModel() {
        return model;
    }

    /**
     * Función que retorna el nombre de la marca del smartphone
     * @return marca.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Función que retorna el nombre del smartphone
     * @return nombre del smartphone.
     */
    public String getName() {
        return name;
    }

    /**
     * Función que almacena el nombre del smartphone.
     * @param name nombre del smartphone.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Función que retorna un toString de los atributos de la clase.
     * @return toString
     */
    @Override
    public String toString() {
        return "Smartphone{" +
                "ip=" + ip +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
