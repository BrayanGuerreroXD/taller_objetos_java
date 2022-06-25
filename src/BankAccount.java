/**
 * Representa una cuenta de banco con sus respectivos atributos.
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class BankAccount {
    /**
     * Representa la variable que almacena el numero de cuenta.
     */
    private int accountNumber;
    /**
     * Representa la variable que determina el estado de la cuenta bancaria.
     */
    boolean activate;

    /**
     * Representa una instancia de la clase BankAccount.
     * @param accountNumber numero de cuenta.
     * @param activate estado de la cuenta.
     */
    public BankAccount(int accountNumber, boolean activate) {
        this.accountNumber = accountNumber;
        this.activate = activate;
    }

    /**
     * Función que returna el estado de la cuenta bancaria (True = Activo , False = No Activo).
     * @return estado de cuenta.
     */
    public boolean isActivate() {
        return activate;
    }

    /**
     * Función que almacena el estado de la cuenta bancaria.
     * @param activate estado de cuenta.
     */
    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
