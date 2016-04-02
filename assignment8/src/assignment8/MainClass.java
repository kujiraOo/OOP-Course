package assignment8;

public class MainClass {

    public static void main(String[] args) {

        // Testing customer
        Customer customerUnknown = new Customer();
        System.out.println(customerUnknown + "\n\n\n");

        Customer customerJane = new Customer("Jane", "Wollfintie 30 65200 Vaasa",
                new Account(1234, 300, 0.1, 0.04));
        System.out.println(customerJane);
        System.out.println("customerJane's total profit: " + customerJane.getTotalProfit());
        System.out.println("customerJane's total tax: " + customerJane.getTotalTax() + "\n\n\n");

        Customer customerBob = new Customer("Bob", "Wollfintie 43 65200 Vaasa", new Account[]{
                new Account(666, 20000, 0.13, 0.07),
                new Account(777, 15000, 0.06, 0.03),
                new Account(333, 7777, 0.1, 0.05)});
        System.out.println(customerBob);
        System.out.println("customerBob's total profit: " + customerBob.getTotalProfit());
        System.out.println("customerBob's total tax: " + customerBob.getTotalTax() + "\n");
        System.out.println("customerBob's total profit from account 666: " + customerBob.getTotalProfit(666));
        System.out.println("customerBob's total tax payed from acccount 666: " + customerBob.getTotalTax(666) + "\n\n\n");

        IBank iBankAccount = new Account(123, 1000, 0.13, 0.07);
        System.out.println(iBankAccount);
        // can not getTax() because it's not defined in IBank interface
        // iBankAccount.getTax();
        System.out.println("balance: " + iBankAccount.getBalance() + "\n\n\n");

        IAccount iAccount = new Account(112, 1200, 0.14, 0.07);
        System.out.println(iAccount);
        // can not getTax() because it's not defined in IAccount interface
        // iAccount.getTax();
        System.out.println("profit: " + iAccount.getProfit());
    }
}
