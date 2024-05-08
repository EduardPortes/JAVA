package progstudo.bankexample.entities;

public class Account {
    private final int codeAccount;
    private String holder;
    private double balance;

    public Account(int codeAccount, String holder, double balance) {
        this.codeAccount = codeAccount;
        this.holder = holder;
        deposit(balance);
    }

    public Account(int codeAccount, String holder) {
        this.codeAccount = codeAccount;
        this.holder = holder;
    }

    public int getCodeAccount() {
        return codeAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void  deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }


    public String toString() {
        return "Account: "
                + getCodeAccount()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}
