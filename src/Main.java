package src;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static double priceFunction(int i) {
        return Math.abs(50 + (450.0 * Math.sin((Math.PI * i) / 15.0)));
    }

    public static List<Product> generateProducts() {
        List<Product> products = new ArrayList<>();
        String[] categories = {
                "Electronics", "Home Appliances", "Furniture", "Toys", "Sports",
                "Clothing", "Books", "Gardening", "Kitchen", "Automotive"
        };

        for (int i = 1; i <= 30; i++) {
            String name = "Product " + i;
            String category = categories[i % categories.length];
            double price = priceFunction(i);
            products.add(new Product(i, name, category, price));
        }

        return products;
    }

    public static List<Product> filterProductsByCategory(List<Product> products, String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public static void test_filter_function() {
        List<Product> products = generateProducts();
        List<Product> filteredProducts = filterProductsByCategory(products, "Toys");

        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {  

        test_filter_function();
    }
}