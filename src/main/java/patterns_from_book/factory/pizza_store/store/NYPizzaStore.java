package patterns_from_book.factory.pizza_store.store;

import pizza_store.Pizza;
import pizza_store.PizzaStore;
import pizza_store.variety_of_pizzas.over_variety_of_pizza.NYCheesePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new NYCheesePizza();
        } /*else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }*/
        return pizza;

    }
}
