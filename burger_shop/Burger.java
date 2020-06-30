package burger_shop;

import java.util.ArrayList;

public class Burger {
    private String name;
    private Meat meat;
    private double price = 6.99;
    private Bread breadType;
    private int maxToppings;
    public static final Burger PLAINBURGER = new Burger("Plain Burger", 2);

    private ArrayList<Toppings> toppings;



    public Burger(String name, int maxToppings) {
        this.name = name;
        this.maxToppings = maxToppings;
        this.toppings = new ArrayList<Toppings>();
    }

    public String getName(){
        return this.name;
    }

    public void addBread(Bread bread){
        this.breadType = bread;
    }

    public void addMeat(Meat meatChoice){
        this.meat = meatChoice;
    }
    public int getMaxToppings(){
        return this.maxToppings;
    }

    public void addToppings( Toppings topping){
        if(this.toppings.size() >= this.maxToppings){
            System.out.println("Exceeded maximum toppings allowed.");
        } else {
            System.out.println("topping added " + topping);
            this.toppings.add(topping);
        }
    }

    public ArrayList<Toppings> getToppings() {
        
        for(int i = 0; i < toppings.size(); i++){
            System.out.println("Toppings " + toppings.get(i).getTopping());
        }
        return this.toppings;
    }

    public double getBurgerPrice(){
        System.out.println("Burger price " + this.price);
        return this.price;
    }

    public double totalBurgerPrice(){
        double burgerPrice = this.price;
        for(int i = 0; i < toppings.size(); i++){
            Toppings checked = this.toppings.get(i);
            burgerPrice += checked.getPrice();
        }
        return burgerPrice;
    }


}


