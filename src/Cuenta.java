public class Cuenta {
    private int id = 0;
    private double balance = 0.0;
    private double anualInterestRate = 0.0;
    private String dateCreated;

    public Cuenta() {
        this.id = 0;
        this.balance = 0.0;
        this.anualInterestRate = 0.0;
    }

    public Cuenta(int id, double balance, double anualInterestRate, String dateCreated) {
        this.id = id;
        this.balance = balance;
        this.anualInterestRate = anualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public double getMonthlyInterestRate(double interes) {
        return 5.4 / 100;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterest() * balance;
    }

    public double withdraw(double cantidad) {
        return balance -= cantidad;
    }

    public double deposit(double cantidad) {
        return balance += cantidad;
    }

}
