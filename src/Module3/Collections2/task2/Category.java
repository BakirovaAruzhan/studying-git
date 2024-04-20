package Module3.Collections2.task2;

import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

