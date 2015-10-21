package com.bestappsbox.PizzaFM;

import java.util.ArrayList;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        setName("Chicago Style Clam Pizza");
        setDough("Chicago dough");
        setSauce("Chicago sauce");
        ArrayList toppings = new ArrayList();
        toppings.add("Chicago topping A");
        toppings.add("Chicago topping B");
        setToppings(toppings);
    }
}