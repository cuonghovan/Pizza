package com.bestappsbox.PizzaFM.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList toppings;

    public void prepare() {
        System.out.println("Preparing " + name + "...");
        System.out.println("Adding " + dough + "...");
        System.out.println("Adding " + sauce + "...");
        for(int i = 0;i<toppings.size();i++) {
            System.out.println("Topping " + toppings.get(i) + "...");
        }
    }
    public void bake() {
        System.out.println("Baking...");
    }

    public void cut() {
        System.out.println("Cutting...");
    }

    public void box() {
        System.out.println("Boxing...");
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setDough(String dough){
        this.dough = dough;
    }

    protected void setSauce(String sauce){
        this.sauce = sauce;
    }

    protected void setToppings(ArrayList toppings){
        this.toppings = toppings;
    }
}