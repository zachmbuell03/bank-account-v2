package bankaccount2;

public class bankaccount2 {
    private String firstname;
    private String lastname;
    private double balance;

    public bankaccount2(String firstname, String lastname, int accountID, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

        
    }

