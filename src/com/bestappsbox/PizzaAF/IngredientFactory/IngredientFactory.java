package com.bestappsbox.PizzaAF.IngredientFactory;

import com.bestappsbox.PizzaAF.Ingredient.Cheese;
import com.bestappsbox.PizzaAF.Ingredient.Clams;
import com.bestappsbox.PizzaAF.Ingredient.Dough;
import com.bestappsbox.PizzaAF.Ingredient.Sauce;

/**
 * Created by cuonghv on 10/20/15.
 */
public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClam();
}
