/**
 * Representa una computadora con sus respectivos atributos.
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Computer {
    private String ip;
    protected int serial;
    public String name;
    public String type;

    /**
     * Representa una instancia de la clase Computer.
     * @param ip número ip del computador.
     * @param serial número de serial del computador.
     * @param name nombre del computador.
     * @param type tipo de computador.
     */
    public Computer(String ip, int serial, String name, String type) {
        this.ip = ip;
        this.serial = serial;
        this.name = name;
        this.type = type;
    }

    /**
     * Función que retorna el número ip del computador.
     * @return número ip
     */
    private String getIp() {
        return ip;
    }

    /**
     * Función que retorna el número de serial del computador.
     * @return número de serial.
     */
    protected int getSerial() {
        return serial;
    }

    /**
     * Función que retorna el nombre del computador.
     * @return nombre.
     */
    public String getName() {
        return name;
    }

    /**
     * Función que almacena el nombre del computador.
     * @param name nombre.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Función que retorna el tipo de computador.
     * @return tipo de computador.
     */
    public String getType() {
        return type;
    }

    /**
     * Función que retorna un toString de los atributos de la clase.
     * @return toString.
     */
    @Override
    public String toString() {
        return "Computer{" +
                "ip='" + ip + '\'' +
                ", serial=" + serial +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
