package Task2.ex6;

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (Author author : authors) {
            authorsString.append(author).append(",");
        }
        if (authors.length > 0) {
            authorsString.deleteCharAt(authorsString.length() - 1);
        }
        return "Book2[name='" + name + "', authors{" + authorsString + "}, price=" + price + ", qty=" + qty + "]";
    }
}
