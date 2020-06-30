package burger_shop;

final public class Side {
    private String name;
    private double price;
    public static final Side FRIES = new Side("Fries", 1.99);
    public static final Side TATORTOTS = new Side("Tator tots", 1.99);
    public static final Side CHILI = new Side("Chili", 2.99);
    public static final Side SALAD = new Side("Salad", 2.49);
    public static final Side WAFFLEFRIES = new Side("Waffle fries", 1.99);

    public Side(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getSide(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}
