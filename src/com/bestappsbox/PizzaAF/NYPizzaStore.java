package com.bestappsbox.PizzaAF;

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