package assignment8;

class Customer {

    private String name;
    private String address;
    private Account[] accounts;

    Customer() {
        name = "unknown";
        address = "unknown";
        accounts = new Account[] {};
    }

    Customer(String name, String address, Account account) {
        this.name = name;
        this.address = address;
        this.accounts = new Account[] {account};
    }

    Customer(String name, String address, Account[] accounts) {
        this.name = name;
        this.address = address;
        this.accounts = accounts;
    }

    // taxes from all accounts
    public double getTotalTax() {
        double totalTax = 0;

        for (int i = 0; i < accounts.length; i++)
            totalTax += accounts[i].getTax();

        return totalTax;
    }

    public double getTotalTax(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber)
                return account.getTax();
        }

        return 0;
    }

    // get profit from all accounts
    public double getTotalProfit() {
        double totalProfit = 0;

        for (int i = 0; i < accounts.length; i++)
            totalProfit += accounts[i].getProfit();

        return totalProfit;
    }

    public double getTotalProfit(int accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber() == accountNumber)
                return accounts[i].getProfit();
        }

        return 0;
    }

    @Override
    public String toString() {

        String accountsStr;

        // if customer has accounts print all of them
        if (accounts.length > 0) {
            accountsStr = "";
            for (int i = 0; i < accounts.length; i++)
                accountsStr += accounts[i].toString() + "\n\n";
        } else {
            accountsStr = "no accounts";
        }

        return "name: " + name +
                "\naddress: " + address +
                "\naccounts:\n\n" + accountsStr;
    }
}
