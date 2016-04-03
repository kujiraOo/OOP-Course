package assignment8;

public class Account implements IAccount {

    private int accountNumber;
    private double balance;
    private double interestRate;
    private double taxRate;

    public Account() {
    }

    public Account(int accountNumber, double balance,
                   double interestRate, double taxRate) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.taxRate = taxRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public double getTax() {
        return taxRate * balance;
    }

    @Override
    public String toString() {
        return "\nbank: " + name +
                "\naddress: " + address +
                "\naccount: " + accountNumber +
                "\nbalance: " + balance +
                "\ninterest rate: " + interestRate +
                "\ntax rate: " + taxRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getProfit() {
        return balance * interestRate - getTax();
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
