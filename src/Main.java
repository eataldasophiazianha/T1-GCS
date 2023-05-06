package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

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

    // public static Call createCall(int id, String employerId, String productId, Date callDate, String description, String status){
    //     Call call = new Call(id, employerId, productId, new Date(),description ,status);
    //     return call;
    // }




    //     public static void test_createCall() {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter the caller name: ");
    //     String caller = scanner.nextLine();
    //     System.out.println("Enter the equipment name: ");
    //     String equipment = scanner.nextLine();
    //     System.out.println("Enter the description: ");
    //     String description = scanner.nextLine();
    //     scanner.close();
    //     String status = "OPEN";

    //     Call call = new Call(1,caller, equipment, new Date(),description , status);
    //     System.out.println(call);
    // }

    public static void test_filter_function() {
        List<Product> products = generateProducts();
        List<Product> filteredProducts = filterProductsByCategory(products, "Toys");

        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }

    public static void moveProduct(){

        if(i = suport){
        System.out.println("Deseja Mover Qual Equipamento?");
        String resp = scanner.nextLine();
            for(i = 0, i< List.generateProducts.length, i++){
                System.out.println(generateProducts.getName);
    }
            for(j = 0, j< generateProducts.length, j++){
                if(resp.equals(generateProducts.getName)){
                System.out.println("Digite o Nome do Novo Setor");
                String novoSetor = scanner.nextLine();
                generateProducts.setDepartament(novoSetor);
      } 
      else{
        System.out.println("Produto Invalido");
      } 
}  
    }

    public static void main(String[] args) {  

        test_filter_function();
        // test_createCall();
    }
}