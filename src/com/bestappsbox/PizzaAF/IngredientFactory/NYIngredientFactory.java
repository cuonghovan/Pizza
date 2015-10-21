package com.bestappsbox.PizzaAF.IngredientFactory;

import com.bestappsbox.PizzaAF.Ingredient.Cheese;
import com.bestappsbox.PizzaAF.Ingredient.Clams;
import com.bestappsbox.PizzaAF.Ingredient.Dough;
import com.bestappsbox.PizzaAF.Ingredient.FreshClams;
import com.bestappsbox.PizzaAF.Ingredient.MarinaraSauce;
import com.bestappsbox.PizzaAF.Ingredient.ReggianoCheese;
import com.bestappsbox.PizzaAF.Ingredient.Sauce;
import com.bestappsbox.PizzaAF.Ingredient.ThinCrustDough;

/**
 * Created by cuonghv on 10/20/15.
 */
public class NYIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
