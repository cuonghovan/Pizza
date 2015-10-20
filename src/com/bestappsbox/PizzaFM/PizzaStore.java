package com.bestappsbox.PizzaFM;

public abstract class PizzaStore {

    public void orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.box();
    }

    public abstract Pizza createPizza(String pizzaType);
}