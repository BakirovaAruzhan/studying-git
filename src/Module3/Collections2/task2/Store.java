package Module3.Collections2.task2;

import java.util.ArrayList;

public class Store {
    ArrayList<Category> categories;

    public Store() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void printCatalog() {
        for (Category category : categories) {
            System.out.println("Category: " + category.name);
            for (Product product : category.products) {
                System.out.println("Product: " + product.name + ", Price: " + product.price + ", Rating: " + product.rating);
            }
            System.out.println();
        }
    }

    public void makePurchase(User user, Product product) {
        user.basket.addProduct(product);
    }

    public void printPurchases(User user) {
        System.out.println("User: " + user.username);
        System.out.println("Purchases:");
        for (Product product : user.basket.products) {
            System.out.println("Product: " + product.name + ", Price: " + product.price);
        }
        System.out.println();
    }
}

