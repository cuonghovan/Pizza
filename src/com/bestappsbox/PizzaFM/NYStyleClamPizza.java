package com.bestappsbox.PizzaFM;

import java.util.ArrayList;

public class NYStyleClamPizza extends Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList toppings;

    public NYStyleClamPizza() {
        name = "NewYork Style Clam Pizza";
        dough = "NewYork dough";
        sauce = "NewYork sauce";
        toppings = new ArrayList();
        toppings.add("NewYork topping A");
        toppings.add("NewYork topping B");
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