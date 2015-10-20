package com.bestappsbox.PizzaAF;

public class ChicagoPizzaStore extends PizzaStore {
    private Pizza pizza;
    private IngredientFactory ingredientFactory;

    public ChicagoPizzaStore(){
        ingredientFactory = new ChicagoIngredientFactory();
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