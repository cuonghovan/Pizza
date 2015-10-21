package com.bestappsbox.PizzaAF.Ingredient;


/**
 * Created by cuonghv on 10/20/15.
 */
public class MozzarellaCheese implements Cheese {
    private String name;

    public MozzarellaCheese(){
        name = "Mozzarella Cheese";
    }

    @Override
    public String getName() {
        return name;
    }
}
