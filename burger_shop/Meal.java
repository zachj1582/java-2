package burger_shop;


final public class Meal {

    private String name;
    private Burger burger;
    private Drink drink;
    private Side side;

    public static final Meal HEALTHYMEAL = new Meal("Healthy Meal", HealthBurger.HEALTHYBURGER, Drink.POWERADE, Side.SALAD);
    public static final Meal PLAINMEAL = new Meal("Plain Meal", Burger.PLAINBURGER, Drink.COKE, Side.FRIES);
    public static final Meal DELUXEMEAL = new Meal("Deluxe Meal", DeluxeBurger.DELUXEBURGER, Drink.COKE, Side.FRIES);

    public Meal(String name, Burger burger, Drink drink, Side side){
        this.name = name;
        this.burger = burger;
        this.drink = drink;
        this.side = side; 
    }

    public double getMealPrice(){
        double mealPrice = Math.round((burger.totalBurgerPrice() * 1.2) *100.00)/100.0;
        return mealPrice;
    }

    public String getMealName(){
        return this.name;
    }

    public void getMeal(){
        System.out.println(this.burger + ", " + this.drink + ", " + this.side + ".");
    }
}
