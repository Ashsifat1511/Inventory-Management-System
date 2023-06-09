import java.util.*;

import classes.*;

public class Start{
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        StockableProduct game1 = new Game("Red Dead Redemption 2", 1, 3000, "Action", 2012, 0, 10, "Rockstar Games");
        StockableProduct game2 = new Game("Spider Man", 2, 4000, "Action", 2019, 0, 5, "insomniac Games");
        StockableProduct music1 = new Music("El Dorado", 3, 1000, "Romance", 2017, 0, 2, "Shakira");
        StockableProduct music2 = new Music("True Colors", 4, 2000, "Life", 2015, 0, 4, "Zedd");
        StockableProduct movie1 = new Movie("Your Name", 5, 2000, "Romance", 2016, 0, 6, "Makoto Shinkai");
        StockableProduct movie2 = new Movie("Spirited Away", 6, 1000, "Fantasy", 2003, 0, 8, "Hayao Miyazaki");

        inventory.addItem(game1);
        inventory.addItem(game2);
        inventory.addItem(music1);
        inventory.addItem(music2);
        inventory.addItem(movie1);
        inventory.addItem(movie2);


        boolean programIsRunning = true;

        Scanner stringInput = new Scanner(System.in);

        Scanner numberInput = new Scanner(System.in);

        System.out.println("----Welcome To Vinyl & CD Shop----");

        while(programIsRunning){
            
            System.out.println("1. Show Inventory and Buy Products");
            System.out.println("2. Add/Edit Product to the Inventory");
            System.out.println("3. Exit Program");
            System.out.print(">>> ");
            int firstOption = numberInput.nextInt();
            
            switch(firstOption){
                case 1:
                {
                    System.out.println("----Inventory and Buying Menu----\n");
                    //inventory.printAllProductInfo();
                    boolean showInventoryAndBuyingMenuIsTrue = true;
                    while(showInventoryAndBuyingMenuIsTrue){
                        System.out.println("\n1. Show Inventory");
                        System.out.println("2. Buy Product");
                        System.out.println("3. Sort products by price");
                        System.out.println("4. Sort products by available stock");
                        System.out.println("5 . Go Back");
                        System.out.print(">>> ");

                        int buyOption = numberInput.nextInt();

                        switch(buyOption){
                            case 1:
                            System.out.println("----Inventory Menu----");
                            //inventory.printAllProductInfo();
                            Invoice invoice = new Invoice();
                            

                            boolean showInvetoryIsTrue = true;
                            while(showInvetoryIsTrue){
                                System.out.println("\n1. Show Games Inventory");
                                System.out.println("2. Show Music Inventory");
                                System.out.println("3. Show Movie Inventory");
                                System.out.println("4. Done Buying/Generate Invoice");
                                System.out.println("5. Go Back");
                                System.out.print(">>> ");

                                int inventoryOption = numberInput.nextInt();

                                switch(inventoryOption){
                                    case 1:
                                    inventory.printAllGameProductsInfo();
                                    boolean buyMore = true;
                                    while(buyMore){
                                        System.out.println("1. Add Product to the Cart");
                                        //System.out.println("2. Remove Product");
                                        System.out.println("2. Done Buying/Generate Invoice");
                                        System.out.println("3. Sort products by price");
                                        System.out.println("4. Sort products by available stock");
                                        System.out.println("5. Go Back");
                                        System.out.print(">>> ");
                                        int buyOption1 = numberInput.nextInt();
                                        switch(buyOption1){
                                            case 1:
                                            System.out.print("Product ID: ");
                                            int productId5 = numberInput.nextInt();
                                            invoice.addProduct(inventory.getItem(productId5));
                                            break;
                                            case 2:
                                            System.out.println(invoice.getInvoice());
                                            buyMore = false;
                                            showInvetoryIsTrue = false;
                                            break;
                                            case 3:
                                            inventory.sortByPrice();
                                            inventory.printAllGameProductsInfo();
                                            break;
                                            case 4:
                                            inventory.sortByAvailableStock();
                                            inventory.printAllGameProductsInfo();
                                            break;
                                            case 5:
                                            buyMore=false;
                                            break;
                                        }
                                    }
                                    break;
                                    case 2:
                                    inventory.printAllMusicProductsInfo();
                                    boolean buyMore1 = true;
                                    while(buyMore1){
                                        System.out.println("1. Add Product to the Cart");
                                        //System.out.println("2. Remove Product");
                                        System.out.println("2. Done Buying/Generate Invoice");
                                        System.out.println("3. Sort products by price");
                                        System.out.println("4. Sort products by available stock");
                                        System.out.println("5. Go Back");
                                        System.out.print(">>> ");
                                        int buyOption1 = numberInput.nextInt();
                                        switch(buyOption1){
                                            case 1:
                                            System.out.print("Product ID: ");
                                            int productId5 = numberInput.nextInt();
                                            invoice.addProduct(inventory.getItem(productId5));
                                            break;
                                            case 2:
                                            System.out.println(invoice.getInvoice());
                                            buyMore1 = false;
                                            showInvetoryIsTrue = false;
                                            break;
                                            case 3:
                                            inventory.sortByPrice();
                                            inventory.printAllMusicProductsInfo();
                                            break;
                                            case 4:
                                            inventory.sortByAvailableStock();
                                            inventory.printAllMusicProductsInfo();
                                            break;
                                            case 5:
                                            buyMore1=false;
                                            break;
                                        }
                                    }
                                    break;
                                    case 3:
                                    inventory.printAllMovieProductsInfo();
                                    boolean buyMore2 = true;
                                    while(buyMore2){
                                        System.out.println("1. Add Product to the Cart");
                                        //System.out.println("2. Remove Product");
                                        System.out.println("2. Done Buying/Generate Invoice");
                                        System.out.println("3. Sort products by price");
                                        System.out.println("4. Sort products by available stock");
                                        System.out.println("5. Go Back");
                                        System.out.print(">>> ");
                                        int buyOption1 = numberInput.nextInt();
                                        switch(buyOption1){
                                            case 1:
                                            System.out.print("Product ID: ");
                                            int productId5 = numberInput.nextInt();
                                            invoice.addProduct(inventory.getItem(productId5));
                                            break;
                                            case 2:
                                            System.out.println(invoice.getInvoice());
                                            buyMore2 = false;
                                            showInvetoryIsTrue = false;
                                            break;
                                            case 3:
                                            inventory.sortByPrice();
                                            inventory.printAllMovieProductsInfo();
                                            break;
                                            case 4:
                                            inventory.sortByAvailableStock();
                                            inventory.printAllMovieProductsInfo();
                                            break;
                                            case 5:
                                            buyMore2=false;
                                            break;
                                        }
                                    }
                                    break;
                                    case 4:
                                    System.out.println(invoice.getInvoice());
                                    showInvetoryIsTrue = false;
                                    break;
                                    case 5:
                                    showInvetoryIsTrue = false;
                                    break;
                                }
                            }

                            
                            break;
                            case 2:
                            {
                                System.out.println("----Select Products to Buy----\n");
                                Invoice invoice5 = new Invoice();
                                boolean buyMore5 = true;
                                while(buyMore5){
                                    System.out.println("1. Add Product");
                                    System.out.println("2. Remove Product");
                                    System.out.println("3. Done Buying/Generate Invoice");
                                    System.out.print(">>> ");
                                    int buyOption15 = numberInput.nextInt();
                                    switch(buyOption15){
                                        case 1:
                                        System.out.print("Product ID: ");
                                        int productId55 = numberInput.nextInt();
                                        invoice5.addProduct(inventory.getItem(productId55));
                                        break;
                                        case 2:
                                        
                                        break;
                                        case 3:
                                        System.out.println(invoice5.getInvoice());
                                        buyMore5 = false;
                                        break;
                                    }
                                }
                                break;
                            }

                            case 3:
                            {
                                inventory.sortByPrice();
                                break;
                            }

                            case 4:
                            {
                                inventory.sortByAvailableStock();
                                break;
                            }
                            case 5:
                            showInventoryAndBuyingMenuIsTrue = false;
                            break;
                        }
                    }
                    
                    break;
                }

                case 2:
                {
                    System.out.println("----Add Product to the Inventory----");
                    System.out.println("1. Game");
                    System.out.println("2. Music");
                    System.out.println("3. Movie");
                    System.out.println("4. Edit Stock");
                    System.out.println("5. Remove Product");
                    System.out.println("6. Go Back");
                    System.out.print(">>> ");
                    int firstOption2 = numberInput.nextInt();
                    switch(firstOption2){
                        case 1:
                        System.out.println("----Add Game to the Inventory----");
                        System.out.print("Name: ");
                        String name = stringInput.nextLine();
                        System.out.print("Product ID: ");
                        int productId = numberInput.nextInt();
                        System.out.print("Price: ");
                        Double price = numberInput.nextDouble();
                        System.out.print("Genre: ");
                        String genre = stringInput.nextLine();
                        System.out.print("Year Published: ");
                        int yearPublished = numberInput.nextInt();
                        System.out.print("Discount: ");
                        int discount = numberInput.nextInt();
                        System.out.print("Number of Items Stocked: ");
                        int numberOfItemsStocked = numberInput.nextInt();
                        System.out.print("Developer: ");
                        String developer = stringInput.nextLine();

                        StockableProduct game = new Game(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked, developer);
                        inventory.addItem(game);
                        System.out.println("Game Added to the Inventory");
                        break;
                        case 2:
                        System.out.println("----Add Music to the Inventory----");
                        System.out.print("Name: ");
                        String name1 = stringInput.nextLine();
                        System.out.print("Product ID: ");
                        int productId1 = numberInput.nextInt();
                        System.out.print("Price: ");
                        Double price1 = numberInput.nextDouble();
                        System.out.print("Genre: ");
                        String genre1 = stringInput.nextLine();
                        System.out.print("Year Published: ");
                        int yearPublished1 = numberInput.nextInt();
                        System.out.print("Discount: ");
                        int discount1 = numberInput.nextInt();
                        System.out.print("Number of Items Stocked: ");
                        int numberOfItemsStocked1 = numberInput.nextInt();
                        System.out.print("Artist Name: ");
                        String artistName1 = stringInput.nextLine();

                        StockableProduct music = new Music(name1, productId1, price1, genre1, yearPublished1, discount1, numberOfItemsStocked1, artistName1);
                        inventory.addItem(music);
                        System.out.println("Music Added to the Inventory");
                        break;
                        case 3:
                        System.out.println("----Add Movie to the Inventory----");
                        System.out.print("Name: ");
                        String name2 = stringInput.nextLine();
                        System.out.print("Product ID: ");
                        int productId2 = numberInput.nextInt();
                        System.out.print("Price: ");
                        Double price2 = numberInput.nextDouble();
                        System.out.print("Genre: ");
                        String genre2 = stringInput.nextLine();
                        System.out.print("Year Published: ");
                        int yearPublished2 = numberInput.nextInt();
                        System.out.print("Discount: ");
                        int discount2 = numberInput.nextInt();
                        System.out.print("Number of Items Stocked: ");
                        int numberOfItemsStocked2 = numberInput.nextInt();
                        System.out.print("Director: ");
                        String director = stringInput.nextLine();

                        StockableProduct movie = new Movie(name2, productId2, price2, genre2, yearPublished2, discount2, numberOfItemsStocked2, director);
                        inventory.addItem(movie);
                        System.out.println("Movie Added to the Inventory");
                        break;
                        case 4:
                        System.out.println("----Edit Stock of the Inventory----");
                        System.out.print("Product ID: ");
                        int productId3 = numberInput.nextInt();
                        System.out.print("New Stock");
                        int newStock3 = numberInput.nextInt();
                        inventory.addProductStock(productId3, newStock3);
                        System.out.println("Stock Edited for the Inventory");
                        break;
                        case 5:
                        System.out.println("----Remove Product from the Inventory----");
                        System.out.print("Product ID: ");
                        int productId4 = numberInput.nextInt();
                        inventory.removeItem(productId4);
                        System.out.println("Removed Producted from the Inventory");
                        break;
                    }
                break;
                }

                case 3:
                {
                    System.out.println("Good Bye, See you soon.......");
                    programIsRunning=false;
                }
                break;
            }
        }

        stringInput.close();
        numberInput.close();
    }
}
