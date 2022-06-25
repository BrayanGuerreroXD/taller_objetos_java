import java.util.Date;

/**
 * Representa una personas con sus diferentes atributos.
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Person {
    /**
     * Representa la variable que almacena el nombre de la persona.
     */
    public String name;
    /**
     * Representa la variable que almacena el primer apellido de la persona.
     */
    public String lastName1;
    /**
     * Representa la variable que almacena el segundo apellido de la persona.
     */
    public String lastname2;
    /**
     * Representa la variable que almacena la fecha de nacimiento de la persona.
     */
    public Date dateBirth;
    /**
     * Representa la variable que almacena la altura de la persona.
     */
    public float heigth;

    /**
     * Representa una instancia de la clase Person.
     * @param name nombre de la persona.
     * @param lastName1 primer apellido de la persona.
     * @param lastname2 segundo apellido de la persona.
     * @param dateBirth fecha de nacimiendo de la persona.
     * @param heigth altura de la persona.
     */
    public Person(String name, String lastName1, String lastname2, Date dateBirth, float heigth) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastname2 = lastname2;
        this.dateBirth = dateBirth;
        this.heigth = heigth;
    }

    /**
     * Función que retorna el nombre de la persona.
     * @return nombre.
     */
    public String getName() {
        return name;
    }

    /**
     * Función que almacena el nombre de la persona.
     * @param name nombre.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Función que retorna el primer apellido de la persona.
     * @return primer apellido.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Función que almacena el primer apellido de la persona.
     * @param lastName1 primer apellido.
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Función que retorna el segundo apellido de la persona.
     * @return segundo apellido.
     */
    public String getLastname2() {
        return lastname2;
    }

    /**
     * Función que almacena el segundo apellido de la persona.
     * @param lastname2 segundo apellido.
     */
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    /**
     * Función que retorna la fecha de nacimiento de la persona.
     * @return fecha de nacimiento.
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Función que almacena la fecha de nacimiento de la persona.
     * @param dateBirth fecha de nacimiento.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Función que retorna la altura de la persona.
     * @return altura.
     */
    public float getHeigth() {
        return heigth;
    }

    /**
     * Función que almacena la altura de la persona.
     * @param heigth altura.
     */
    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
}
