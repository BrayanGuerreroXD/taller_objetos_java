public class Computer {
    private String ip;
    protected int serial;
    public String name;
    public String type;

    public Computer(String ip, int serial, String name, String type) {
        this.ip = ip;
        this.serial = serial;
        this.name = name;
        this.type = type;
    }

    private String getIp() {
        return ip;
    }

    protected int getSerial() {
        return serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

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
