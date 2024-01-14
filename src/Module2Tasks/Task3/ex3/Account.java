package Module2Tasks.Task3.ex3;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer1, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer1) {
        this.id = id;
        this.customer = customer1;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer1() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Ex3.Account{" +
                "id=" + id +
                ", customer=" + customer.getName() +
                ", balance=" + balance +
                '}';
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
}