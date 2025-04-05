import java.util.HashMap;
import java.util.Map;
class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void updateQuantity(int quantity) {
        if (this.quantity + quantity >= 0) {
            this.quantity += quantity;
            System.out.println("Updated quantity of '" + name + "' to " + this.quantity);
        } else {
            System.out.println("Not enough stock of '" + name + "' to reduce quantity by " + quantity);
        }
    }
}

class Inventory {
    private Map<String, Product> products;
    public Inventory() {
        products = new HashMap<>();
    }
    public void addProduct(Product product) {
        products.put(product.getName(), product);
        System.out.println("Product '" + product.getName() + "' has been added to the inventory.");
    }
    public void checkStock(String productName) {
        Product product = products.get(productName);
        if (product != null) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice() + ", Quantity: " + product.getQuantity());
        } else {
            System.out.println("Product '" + productName + "' not found in inventory.");
        }
    }
    public void updateProductQuantity(String productName, int quantity) {
        Product product = products.get(productName);
        if (product != null) {
            product.updateQuantity(quantity);
        } else {
            System.out.println("Product '" + productName + "' not found in inventory.");
        }
    }
}

public class Maps {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("Laptop", 1200.0, 10);
        Product product2 = new Product("Smartphone", 800.0, 50);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.checkStock("Laptop");
        inventory.checkStock("Smartphone");
        inventory.updateProductQuantity("Laptop", -5);  // Sell 5 laptops
        inventory.updateProductQuantity("Smartphone", 20);  // Add 20 smartphones
        inventory.checkStock("Laptop");
        inventory.checkStock("Smartphone");
    }
}
