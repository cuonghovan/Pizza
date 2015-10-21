package com.bestappsbox.PizzaAF.IngredientFactory;

import com.bestappsbox.PizzaAF.Ingredient.Cheese;
import com.bestappsbox.PizzaAF.Ingredient.Clams;
import com.bestappsbox.PizzaAF.Ingredient.Dough;
import com.bestappsbox.PizzaAF.Ingredient.FrozenClams;
import com.bestappsbox.PizzaAF.Ingredient.MozzarellaCheese;
import com.bestappsbox.PizzaAF.Ingredient.PlumTomatoSauce;
import com.bestappsbox.PizzaAF.Ingredient.Sauce;
import com.bestappsbox.PizzaAF.Ingredient.ThickCrustDough;

/**
 * Created by cuonghv on 10/20/15.
 */
public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
