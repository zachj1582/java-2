package burger_shop;

import java.util.ArrayList;

public class Order {

    private ArrayList<Burger> burger = new ArrayList<Burger>();
    private ArrayList<Bread> bread = new ArrayList<Bread>();
    private ArrayList<Meat> meat = new ArrayList<Meat>();
    private ArrayList<Meal> meal = new ArrayList<Meal>();
    private ArrayList<Drink> drinks = new ArrayList<Drink>();
    private ArrayList<Side> sides = new ArrayList<Side>();

    public Order(Burger burger, Bread bread, Meat meat) {
        this.bread.add(bread);
        this.burger.add(burger);
        this.meat.add(meat);
    }

    public Order(Meal meal) {
        this.meal.add(meal);
    }

    public void addToppings(Toppings topping){
        this.burger.get(this.burger.size()-1).addToppings(topping);
    }

    public void addDrink(Drink drink){
        this.drinks.add(drink);
    }

    public void addSides(Side side){
        this.sides.add(side);
    }

    public void addBurger(Burger burger){
        this.burger.add(burger);
    }

    public void addMeal(Meal meal){
        this.meal.add(meal);
    }


    public void purchaseOrder(){
        double burgerPrice = 0;
        System.out.println("Reciept: \n");
        for(int i =0; i < this.burger.size(); i++){
            burgerPrice += burger.get(i).totalBurgerPrice();
            System.out.println(burger.get(i).getName() + " " + burger.get(i).totalBurgerPrice()+ "\n");
        }
        double sidePrice = 0;
        for(int i =0; i < this.sides.size(); i++){
            sidePrice += sides.get(i).getPrice();
            System.out.println(sides.get(i).getSide() + " " + sides.get(i).getPrice() + "\n");
        }
        double drinkPrice = 0;
        for(int i =0; i < this.drinks.size(); i++){
            drinkPrice += drinks.get(i).getPrice();
            System.out.println(drinks.get(i).getDrink() + " " + drinks.get(i).getPrice() + "\n");
        }
        double mealPrice = 0;
        for(int i =0; i < this.meal.size(); i++){
            mealPrice += meal.get(i).getMealPrice();
            System.out.println(meal.get(i).getMealName() + " " + meal.get(i).getMealPrice() + "\n");
        }

        double subTotal = Math.round((burgerPrice + sidePrice + drinkPrice + mealPrice) * 100.00) / 100.00;
        double tax = Math.round((subTotal * 0.0825) * 100.00) / 100.00;
        double total = Math.round((subTotal + tax) * 100.00) / 100.00;
        System.out.println("Subtotal: " + subTotal + "\n" + 
                            "Tax: " + tax + "\n" +
                            "Total: " + total + "\n" +
                            "Thank you for your purchase!");

    }
}
