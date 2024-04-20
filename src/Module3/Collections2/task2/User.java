package Module3.Collections2.task2;

public class User {
    String username;
    String password;
    Basket basket;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new Basket();
    }
}