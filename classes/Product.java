package classes;

import java.util.*;

public abstract class Product {
    private String name;
    private int productId;
    private double price;
    private String genre;
    private int yearPublished;
    private double discount;

    // Constructor
    public Product(String name, int productId, double price, String genre, int yearPublished, double discount) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.discount = discount;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // getInfo() method
    public String getInfo() {
        return "Name: " + name + "\n"
                + "Product ID: " + productId + "\n"
                + "Price: $" + price + "\n"
                + "Genre: " + genre + "\n"
                + "Year Published: " + yearPublished + "\n"
                + "Discount: " + discount + "%";
    }

    // toString() method
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", yearPublished=" + yearPublished +
                ", discount=" + discount +
                '}';
    }
}
