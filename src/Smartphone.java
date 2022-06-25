/**
 * Representa un smartphone con sus respectivos atributos
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Smartphone {
    private int ip;
    protected String model;
    public String brand;
    public String name;

    public Smartphone(int ip, String model, String brand, String name) {
        this.ip = ip;
        this.model = model;
        this.brand = brand;
        this.name = name;
    }

    private int getIp() {
        return ip;
    }

    protected String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
