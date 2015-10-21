package com.bestappsbox.PizzaAF.Pizza;

import com.bestappsbox.PizzaAF.IngredientFactory.IngredientFactory;

/**
 * Created by cuonghv on 10/20/15.
 */
public class ClamPizza extends Pizza {

    public ClamPizza(IngredientFactory ingredientFactory){
        super(ingredientFactory);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing...");
        System.out.println("Adding " + getDough().getName() + "...");
        System.out.println("Adding " + getSauce().getName() + "...");
        System.out.println("Adding " + getCheese().getName() + "...");
        System.out.println("Adding " + getClams().getName() + "...");
    }
}
