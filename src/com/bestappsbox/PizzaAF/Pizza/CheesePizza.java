package com.bestappsbox.PizzaAF.Pizza;

import com.bestappsbox.PizzaAF.IngredientFactory.IngredientFactory;

/**
 * Created by cuonghv on 10/20/15.
 */
public class CheesePizza extends Pizza {

    public CheesePizza(IngredientFactory ingredientFactory){
        super(ingredientFactory);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing...");
        System.out.println("Adding " + getDough().getName() + "...");
        System.out.println("Adding " + getSauce().getName() + "...");
        System.out.println("Adding " + getCheese().getName() + "...");
    }
}
