package com.bestappsbox.PizzaAF;

/**
 * Created by cuonghv on 10/20/15.
 */
public class ReggianoCheese implements Cheese{
    private String name;

    public ReggianoCheese(){
        name = "Reggiano Cheese";
    }

    @Override
    public String getName() {
        return name;
    }
}
