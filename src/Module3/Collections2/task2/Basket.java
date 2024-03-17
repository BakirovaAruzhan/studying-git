package Module3.Collections2.task2;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

