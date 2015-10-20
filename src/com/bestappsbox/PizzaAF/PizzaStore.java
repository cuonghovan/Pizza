package com.bestappsbox.PizzaAF;

public abstract class PizzaStore {

    public void orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public abstract Pizza createPizza(String pizzaType);
}