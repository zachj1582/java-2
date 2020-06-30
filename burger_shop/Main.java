package burger_shop;


public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(Meal.DELUXEMEAL);
        order1.addBurger(Burger.PLAINBURGER);
        order1.addToppings(Toppings.CHEESE);
        order1.addToppings(Toppings.LETTUCE);
        order1.addToppings(Toppings.BACON);
        order1.addDrink(Drink.DIETCOKE);
        order1.addSides(Side.CHILI);
        order1.addMeal(Meal.HEALTHYMEAL);
        order1.purchaseOrder();


    }

}
