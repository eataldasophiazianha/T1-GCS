package src;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static double priceFunction(int i) {
        return 50 + (450.0 * Math.sin((Math.PI * i) / 15.0));
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

    public static void main(String[] args) {  
        List<Product> products = new ArrayList<>();
        System.out.println("Hello World!");
    }
}