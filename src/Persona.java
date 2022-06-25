import java.util.Date;

public class Persona {
    public String name;
    public String lastName1;
    public String lastname2;
    public Date dateBirth;
    public float heigth;

    public Persona(String name, String lastName1, String lastname2, Date dateBirth, float heigth) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastname2 = lastname2;
        this.dateBirth = dateBirth;
        this.heigth = heigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
}
