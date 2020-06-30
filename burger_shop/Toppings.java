package burger_shop;


final public class Toppings {
    private String topping;
    private double price;
    private boolean healthy;
    public static final Toppings TOMATO = new Toppings("Tomato", 0.50, true);
    public static final Toppings PICKLES = new Toppings("Pickles", 0.50, true);
    public static final Toppings ONIONS = new Toppings("Onions", 0.50, true);
    public static final Toppings LETTUCE = new Toppings("Lettuce", 0.50, true);
    public static final Toppings CHEESE = new Toppings("Cheese", 1.00, false);
    public static final Toppings BACON = new Toppings("Bacon", 1.50, false);
    public static final Toppings GUACAMOLE = new Toppings("Guacamole", 1.00, false);
    


    public Toppings(String topping, double price, boolean healthy){
        this.topping = topping;
        this.price = price;
        this.healthy = healthy;
    }
    
    public String getTopping(){
        return this.topping;
    }

    public double getPrice(){
        return this.price;
    }
    public boolean getHealthy(){
        return this.healthy;
    }
}