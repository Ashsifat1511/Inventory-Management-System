package classes;

public class Movie extends StockableProduct {
    private String director;

    // Constructor for Movie
    public Movie(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked, String director) {
        super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
        this.director = director;
    }

    // Getter and Setter for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Override toString() method
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Director: " + director;
    }

    // Override getInfo() method
    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Director: " + director;
    }
}
