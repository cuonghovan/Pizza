package com.bestappsbox.PizzaFM;

public class ChicagoPizzaFactory extends PizzaStore {
    Pizza pizza;
    public Pizza createPizza(String pizzaType) {
        if(pizzaType == "cheese")
            pizza = new ChicagoStyleCheesePizza();
        else if(pizzaType == "clam")
            pizza = new ChicagoStyleClamPizza();
        else
            pizza = null;
        return pizza;
    }
}