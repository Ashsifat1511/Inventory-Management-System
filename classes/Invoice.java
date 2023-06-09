package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> items;
    private LocalDateTime date;

    // Constructors
    public Invoice() {
        items = new ArrayList<>();
        date = LocalDateTime.now();
    }

    public Invoice(ArrayList<Product> items) {
        this.items = items;
        date = LocalDateTime.now();
    }

    // Getter for LocalDateTime
    public String getLocalDateTime() {
        return date.toString();
    }

    // Add a product to the invoice
    public void addProduct(Product product) {
        items.add(product);
    }

    // Remove a product from the invoice
    public void removeProduct(Product product) {
        items.remove(product);
    }

    // Calculate the total price of the items without considering discounts
    private double calculatePriceWithoutDiscount() {
        double totalPrice = 0;
        for (Product product : items) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    // Check if the full house discount is available
    private boolean isFullHouseDiscountAvailable() {
        int gameCount = 0;
        int musicCount = 0;
        int movieCount = 0;
    
        for (Product product : items) {
            if (product instanceof Game) {
                gameCount++;
            } 
            else if (product instanceof Music) {
                musicCount++;
            } 
            else if (product instanceof Movie) {
                movieCount++;
            }
        }
    
        // Check if there are at least 2 products in each category
        return gameCount >= 2 && musicCount >= 2 && movieCount >= 2;
    }

    // Calculate the discounted price
    private double calculateDiscountedPrice() {
        double totalPrice = calculatePriceWithoutDiscount();
        if (isFullHouseDiscountAvailable()) {
            return totalPrice - (totalPrice * 0.5); // 50% discount for full house
        } 
        else {
            return totalPrice;
        }
    }

    // Get the invoice details as a string
    public String getInvoice() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice Details:\n");
        invoice.append("Date: ").append(date).append("\n");
        invoice.append("Items:\n");
        for (Product product : items) {
            invoice.append("- ").append(product.getName()).append(": ").append(product.getPrice()).append("\n");
        }
        invoice.append("Total Price (without discount): ").append(calculatePriceWithoutDiscount()).append("\n");
        invoice.append("Discounted Price: ").append(calculateDiscountedPrice()).append("\n");
        return invoice.toString();
    }
}
