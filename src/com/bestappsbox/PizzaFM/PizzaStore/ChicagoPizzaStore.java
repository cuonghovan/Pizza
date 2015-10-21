package com.bestappsbox.PizzaFM.PizzaStore;

import com.bestappsbox.PizzaFM.Pizza.ChicagoStyleCheesePizza;
import com.bestappsbox.PizzaFM.Pizza.ChicagoStyleClamPizza;
import com.bestappsbox.PizzaFM.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
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