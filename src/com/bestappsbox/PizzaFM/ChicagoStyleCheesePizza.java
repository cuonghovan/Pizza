package com.bestappsbox.PizzaFM;

import java.util.ArrayList;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Cheese Pizza");
        setDough("Chicago dough");
        setSauce("Chicago sauce");
        ArrayList toppings = new ArrayList();
        toppings.add("Chicago topping A");
        toppings.add("Chicago topping B");
        setToppings(toppings);
    }


}