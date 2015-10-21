package com.bestappsbox.PizzaAF.PizzaStore;

import com.bestappsbox.PizzaAF.IngredientFactory.IngredientFactory;
import com.bestappsbox.PizzaAF.IngredientFactory.NYIngredientFactory;
import com.bestappsbox.PizzaAF.Pizza.CheesePizza;
import com.bestappsbox.PizzaAF.Pizza.ClamPizza;
import com.bestappsbox.PizzaAF.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    private IngredientFactory ingredientFactory;
    private Pizza pizza;

    public NYPizzaStore(){
        this.ingredientFactory = new NYIngredientFactory();
    }
    public Pizza createPizza(String pizzaType) {
       if(pizzaType == "cheese")
           pizza = new CheesePizza(ingredientFactory);
        else if(pizzaType == "clam")
           pizza = new ClamPizza(ingredientFactory);
        else
           pizza = null;
        return pizza;
    }
}