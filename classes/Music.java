package classes;

public class Music extends StockableProduct {
    private String artistName;

    // Constructor for Music
    public Music(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked, String artistName) {
        super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
        this.artistName = artistName;
    }

    // Getter and Setter for artistName
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    // Override toString() method
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Artist Name: " + artistName;
    }

    // Override getInfo() method
    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Artist Name: " + artistName;
    }
}
