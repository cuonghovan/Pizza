package com.bestappsbox.PizzaFM.Pizza;

import java.util.ArrayList;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        setName("NewYork Style Cheese Pizza");
        setDough("NewYork dough");
        setSauce("NewYork sauce");
        ArrayList toppings = new ArrayList();
        toppings.add("NewYork topping A");
        toppings.add("NewYork topping B");
        setToppings(toppings);
    }
}