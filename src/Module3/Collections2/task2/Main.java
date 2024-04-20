package Module3.Collections2.task2;

public class Main {
    public static void main(String[] args) {
        Category electronics = new Category("Electronics");
        electronics.addProduct(new Product("IPhone", 1000.0, 4));
        electronics.addProduct(new Product("AirPods", 700.0, 5));

        Category clothing = new Category("Clothing");
        clothing.addProduct(new Product("Cloth", 20.0, 4));
        clothing.addProduct(new Product("Jacket", 50.0, 3));

        Store store = new Store();
        store.addCategory(electronics);
        store.addCategory(clothing);

        store.printCatalog();

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        store.makePurchase(user1, electronics.products.get(0));
        store.makePurchase(user1, clothing.products.get(1));
        store.makePurchase(user2, electronics.products.get(1));

        store.printPurchases(user1);
        store.printPurchases(user2);
    }
}