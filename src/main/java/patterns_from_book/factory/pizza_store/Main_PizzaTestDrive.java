package patterns_from_book.factory.pizza_store;

import pizza_store.store.ChicagoPizzaStore;
import pizza_store.store.NYPizzaStore;

public class Main_PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Order: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Order: " + pizza.getName() + "\n");


    }
}
