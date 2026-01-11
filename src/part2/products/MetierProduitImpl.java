package part2.products;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Product> {
    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product o) {
        products.add(o);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Product productToRemove = findById(id);
        if (productToRemove != null) {
            products.remove(productToRemove);
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }
}
