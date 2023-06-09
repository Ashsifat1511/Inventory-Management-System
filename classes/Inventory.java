package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import interfaces.Iterable;

public class Inventory implements Iterable {
    private ArrayList<StockableProduct> items;

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // Add an item to the inventory
    public void addItem(StockableProduct product) {
        items.add(product);
    }

    // Remove an item from the inventory
    public void removeItem(int productId) {
        StockableProduct foundProduct = null;
        for (StockableProduct product : items) {
            if (product.getProductId() == productId) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct != null) {
            items.remove(foundProduct);
        }
    }

    // Get an item from the inventory
    public Product getItem(int productId) {
        for (StockableProduct product : items) {
            if (product.getProductId() == productId) {
                if (product.getNumberOfItemsStocked() > 0) {
                    product.removeStock(1);
                    return product;
                } else {
                    return null;
                }
            }
        }
        return null;
    }


    public void addProductStock(int productId, int numberOfNewStock) {
        for (StockableProduct product : items) {
            if (product.getProductId() == productId) {
                product.addStock(numberOfNewStock);
                return;
            }
        }
    }


    // Sort items in the inventory by price
    public void sortByPrice() {
        Collections.sort(items, new Comparator<StockableProduct>() {
            @Override
            public int compare(StockableProduct o1, StockableProduct o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }});
    }

    // Sort items in the inventory by available stock
    public void sortByAvailableStock() {
        Collections.sort(items, new Comparator<StockableProduct>() {
            @Override
            public int compare(StockableProduct o1, StockableProduct o2) {
                return Integer.compare(o1.getNumberOfItemsStocked(), o2.getNumberOfItemsStocked());
            }});
    }


    //outside the mentioned structured and prints item details
    /*public void printAllProductInfo() {
        for (StockableProduct product : items) {
            System.out.println(product.getInfo());
        }
    }*/

    public void printAllGameProductsInfo() {
        for (StockableProduct product : items) {
            if(product instanceof Game){
                System.out.println(product.getInfo()+"\n");
            }
        }
    }

    public void printAllMusicProductsInfo() {
        for (StockableProduct product : items) {
            if(product instanceof Music){
                System.out.println(product.getInfo()+"\n");
            }
        }
    }

    public void printAllMovieProductsInfo() {
        for (StockableProduct product : items) {
            if(product instanceof Movie){
                System.out.println(product.getInfo()+"\n");
            }
        }
    }
    


}
