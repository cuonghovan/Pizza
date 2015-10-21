package com.bestappsbox.PizzaAF.Ingredient;


/**
 * Created by cuonghv on 10/20/15.
 */
public class PlumTomatoSauce implements Sauce {
    private String name;

    public PlumTomatoSauce(){
        name = "Plum Tomato Sauce";
    }

    @Override
    public String getName() {
        return name;
    }
}
