package classes;

public class Game extends StockableProduct {
    private String developer;

    public Game(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked, String developer) {
        super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
        this.developer = developer;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Developer: " + developer;
    }

    
    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Developer: " + developer;
    }
}
