package Ex3;

public class Account {
    private int id;
    private Customer2 customer2;
    private double balance = 0.0;

    public Account(int id, Customer2 customer2, double balance) {
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }

    public Account(int id, Customer2 customer2) {
        this.id = id;
        this.customer2 = customer2;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Name: " + customer2.getName() + ", Balance: " + balance;
    }

    public String getCustomerName() {
        return customer2.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return this;
        } else {
            System.out.println("Amount withdraw exceeds the current balance!");
            return null;
        }
    }

    public static void main(String[] args) {
        Customer2 customer = new Customer2(1, "John", 10);
        Account account = new Account(101, customer, 100.0);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(50.0);
        System.out.println("New Balance after deposit: " + account.getBalance());

        account.withdraw(30.0);
        System.out.println("New Balance after withdrawal: " + account.getBalance());
    }



}

