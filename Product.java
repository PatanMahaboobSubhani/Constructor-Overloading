public class Product {
    private int productId;
    private String productName;
    private double price;

    // Constructor that takes all fields
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Constructor with default values using this()
    public Product() {
        this(0, "Unnamed Product", 0.0);
    }

    // Optional method to display product info
    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }
}

//Test Class: Main
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 75000);
        Product p2 = new Product(); // Uses default values

        System.out.println("Product 1:");
        p1.displayInfo();

        System.out.println("\nProduct 2:");
        p2.displayInfo();
    }
}
