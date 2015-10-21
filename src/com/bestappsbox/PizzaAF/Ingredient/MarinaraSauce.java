package com.bestappsbox.PizzaAF.Ingredient;

/**
 * Created by cuonghv on 10/20/15.
 */
public class MarinaraSauce implements Sauce {
    private String name;

    public MarinaraSauce(){
        name = "Marinara Sauce";
    }

    @Override
    public String getName() {
        return name;
    }
}
