package com.bestappsbox.PizzaFM.Pizza;

import java.util.ArrayList;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        setName("NewYork Style Clam Pizza");
        setDough("NewYork dough");
        setSauce("NewYork sauce");
        ArrayList toppings = new ArrayList();
        toppings.add("NewYork topping A");
        toppings.add("NewYork topping B");
        setToppings(toppings);
    }
}