package com.bestappsbox.PizzaFM;

public abstract class Pizza {
    private String dough;
    private String sauce;
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

}