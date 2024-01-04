package Ex2;

import Ex2.Customer;

public class Invoice   {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {

        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public int getCustomerDiscount(){
        return getCustomerDiscount();
    }

    public int getAmountAfterDiscount(){

        return getAmountAfterDiscount();
    }

    public String getCustomerName() {
        return customer.getName();

    }

    public int getCustomerDiscount() {

        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {

        return amount - (amount * customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        return "Ex2.Invoice{id=" + id + ", customer=" + customer + ", amount=" + amount + '}';
    }
}



