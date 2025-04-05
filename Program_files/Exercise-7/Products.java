class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            price = price - (price * discountPercent / 100);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }
}
public class Products {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Original Price: $" + product.getPrice());
        product.applyDiscount(10);
        System.out.println("Price after 10% discount: $" + product.getPrice());
        product.setPrice(1200); // Setting a new price
        System.out.println("New Price: $" + product.getPrice());
    }
}
