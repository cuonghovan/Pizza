package com.bestappsbox.PizzaFM;

public abstract class Pizza {

    public abstract void prepare();

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