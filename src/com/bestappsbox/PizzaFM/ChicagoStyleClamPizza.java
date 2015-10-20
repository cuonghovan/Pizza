package com.bestappsbox.PizzaFM;

import java.util.ArrayList;

public class ChicagoStyleClamPizza extends Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList toppings;

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
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