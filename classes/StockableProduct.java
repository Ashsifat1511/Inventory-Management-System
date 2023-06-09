package classes;
import interfaces.*;


import interfaces.Stockable;

public class StockableProduct extends Product implements Stockable{
    private int numberOfItemsStocked;

    public StockableProduct(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked) {
        super(name, productId, price, genre, yearPublished, discount);
        this.numberOfItemsStocked = numberOfItemsStocked;
    }

    
    public int getNumberOfItemsStocked() {
        return numberOfItemsStocked;
    }

    public void setNumberOfItemsStocked(int numberOfItemsStocked) {
        this.numberOfItemsStocked = numberOfItemsStocked;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Number of Items Stocked: " + numberOfItemsStocked;
    }

    public void addStock(int num){
        numberOfItemsStocked+=num;
    }

    public void editStock(int num){
        numberOfItemsStocked=num;
    }

    public void removeStock(int num){
        numberOfItemsStocked-=num;
    }
}
