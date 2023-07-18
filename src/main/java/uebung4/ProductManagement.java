package uebung4;

import java.util.ArrayList;
import java.util.List;

// Model
public class ProductManagement {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return products;
    }
}