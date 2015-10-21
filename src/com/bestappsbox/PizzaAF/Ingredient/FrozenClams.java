package com.bestappsbox.PizzaAF.Ingredient;


/**
 * Created by cuonghv on 10/20/15.
 */
public class FrozenClams implements Clams {
    private String name;
    public FrozenClams(){
        name = "Frozen Clams";
    }

    @Override
    public String getName() {
        return name;
    }
}
