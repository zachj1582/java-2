package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    private ArrayList<Toppings> toppings;
    public static final DeluxeBurger DELUXEBURGER = new DeluxeBurger("Deluxe burger", 6);

    public DeluxeBurger(String name, int maxTopping){
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
