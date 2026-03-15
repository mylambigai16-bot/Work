package ClassesObjects;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for product details
    public String getProductDetails() {
        return "Product ID: " + productId +
               ", Name: " + productName +
               ", Price: Rs." + price +
               ", Quantity: " + quantity +
               ", Total: Rs." + calculateTotal();
    }

    // Safely update quantity
    public void setQuantity(int newQty) {
        if (newQty >= 0) {
            this.quantity = newQty;
        } else {
            System.out.println("Invalid quantity. Quantity cannot be negative.");
        }
    }

    // Calculate total for this product
    public double calculateTotal() {
        return price * quantity;
    }

    // Getter for productId (needed for Cart operations)
    public int getProductId() {
        return productId;
    }
}

// Cart class
class Cart {
    private List<Product> products;

    // Constructor
    public Cart() {
        products = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Added to cart: " + p.getProductDetails());
    }

    // Remove product by productId
    public void removeProduct(int productId) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == productId) {
                System.out.println("Removed from cart: " + products.get(i).getProductDetails());
                products.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found in cart.");
        }
    }

    // Calculate total cost of the cart
    public double calculateCartTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.calculateTotal();
        }
        return total;
    }

    // Display all products and total cart value
    public void displayCartItems() {
        System.out.println("\n--- Cart Items ---");
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product p : products) {
                System.out.println(p.getProductDetails());
            }
            System.out.println("Total Cart Value: Rs." + calculateCartTotal());
        }
        System.out.println("------------------\n");
    }
}

// Main class to demonstrate functionality
public class ProductCartManagement {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Headphones", 1500, 2);
        Product p3 = new Product(103, "Mouse", 800, 1);

        // Create a cart
        Cart cart = new Cart();

        // Add products to cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        // Display cart items
        cart.displayCartItems();

        // Update quantity of a product
        p2.setQuantity(3);
        System.out.println("Updated quantity for Headphones.");
        cart.displayCartItems();

        // Remove a product
        cart.removeProduct(103); // Remove Mouse
        cart.displayCartItems();
    }
}
