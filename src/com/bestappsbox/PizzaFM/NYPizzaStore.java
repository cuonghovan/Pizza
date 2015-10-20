package com.bestappsbox.PizzaFM;

public class NYPizzaStore extends PizzaStore {
    Pizza pizza;
    public Pizza createPizza(String pizzaType) {
       if(pizzaType == "cheese")
           pizza = new NYStyleCheesePizza();
        else if(pizzaType == "clam")
           pizza = new NYStyleClamPizza();
        else
           pizza = null;
        return pizza;
    }
}