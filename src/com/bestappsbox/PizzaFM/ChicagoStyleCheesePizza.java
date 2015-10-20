package com.bestappsbox.PizzaFM;

import java.util.ArrayList;

public class ChicagoStyleCheesePizza extends Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList toppings;

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Chicago dough";
        sauce = "Chicago sauce";
        toppings = new ArrayList();
        toppings.add("Chicago topping A");
        toppings.add("Chicago topping B");
    }

    public void prepare() {
        System.out.println("Preparing " + name + "...");
        System.out.println("Adding " + dough + "...");
        System.out.println("Adding " + sauce + "...");
        for(int i = 0;i<toppings.size();i++) {
            System.out.println("Topping " + toppings.get(i) + "...");
        }
    }
}