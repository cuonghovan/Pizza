package com.bestappsbox.PizzaAF.Ingredient;


/**
 * Created by cuonghv on 10/20/15.
 */
public class ThickCrustDough implements Dough {
    private String name;
    public ThickCrustDough(){
        name = "Thick Crust Dough";
    }

    @Override
    public String getName() {
        return name;
    }
}
