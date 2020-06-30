package burger_shop;

public class Drink {
    
    private String name;
    private double price;
    public static final Drink COKE = new Drink("Coke", 1.99);
    public static final Drink DIETCOKE = new Drink("Diet Coke", 1.99);
    public static final Drink SPRITE = new Drink("Sprite", 1.99);
    public static final Drink DRPEPPER = new Drink("Dr Pepper", 1.99);
    public static final Drink WATER = new Drink("Water", 1.99);
    public static final Drink POWERADE = new Drink("Powerade", 1.99);


    public Drink(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getDrink(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}