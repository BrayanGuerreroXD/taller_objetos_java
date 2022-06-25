public class BankAccount {
    private int accountNumber;
    boolean activate;

    public BankAccount(int accountNumber, boolean activate) {
        this.accountNumber = accountNumber;
        this.activate = activate;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}