package Task1.Ex4;

public class Book {
    private String name;
    private String author;
    private double price;
    private String type;

    private int gty;

    public int getGty() {
        return gty;
    }

    public void setGty(int gty) {
        this.gty = gty;
    }

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public Book(String name, String author, double price, String type, int gty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.gty = gty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void calculatePrice() {
        if ("Classical".equals(type)) {
            price *= 0.9;
        } else if ("Bestseller".equals(type)) {
            price *= 1.2;
        }
    }

    @Override
    public String toString() {
        return "Task1.Ex4.Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", gty=" + gty +
                '}';
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Simple Task1.Ex4.Book", "J.K. Rowling", 15000, "Simple"),
                new Book("Classical Task1.Ex4.Book", "Suzanne Collins", 40000, "Classical"),
                new Book("Bestseller Task1.Ex4.Book", "SenLinYu", 50000.0, "Bestseller")
        };
        System.out.println("Before Price Calculation:");

        for (Book book : books) {
            System.out.println(book);
        }
        for (Book book : books) {
            book.calculatePrice();
        }
        System.out.println("After Price Calculation:");
        for (Book book : books) {
            System.out.println(book);
        }
        books[0].setName("Updated Simple Task1.Ex4.Book");
        System.out.println("After Name Update:");
        System.out.println(books[0]);


    }

}