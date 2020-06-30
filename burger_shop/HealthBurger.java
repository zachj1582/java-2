package burger_shop;

import java.util.ArrayList;

public class HealthBurger extends Burger {
    
    private ArrayList<Toppings> toppings;
    public static final HealthBurger HEALTHYBURGER = new HealthBurger("Healthy Burger", 4);
    
    public HealthBurger(String name, int maxTopping){
        super(name, maxTopping);
        this.toppings = new ArrayList<Toppings>();
    }

    @Override
    public void addToppings(Toppings topping){
        if(getToppings().size() >= getMaxToppings()){
            System.out.println("Exceeded maximum toppings allowed.");
        } else {
            System.out.println("topping added " + topping);
            this.toppings.add(topping);
        }
    }
}
