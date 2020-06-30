package burger_shop;

final public class Meat {

    private String meatChoice;
    public static final Meat BEEF = new Meat("Beef");
    public static final Meat STEAK = new Meat("Steak");
    public static final Meat CHICKEN = new Meat("Chicken");
    public static final Meat VEGGIE = new Meat("Veggie Burger");

    public Meat(String meatChoice){
        this.meatChoice=meatChoice;
    }

    public String getMeatChoice(){
        return this.meatChoice;
    }
}
