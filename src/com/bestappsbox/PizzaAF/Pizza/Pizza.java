package com.bestappsbox.PizzaAF.Pizza;

import com.bestappsbox.PizzaAF.Ingredient.Cheese;
import com.bestappsbox.PizzaAF.Ingredient.Clams;
import com.bestappsbox.PizzaAF.Ingredient.Dough;
import com.bestappsbox.PizzaAF.Ingredient.Sauce;
import com.bestappsbox.PizzaAF.IngredientFactory.IngredientFactory;

public abstract class Pizza {
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Clams clams;

    protected Pizza(IngredientFactory ingredientFactory){
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
    public abstract void prepare();

    public void bake() {
        System.out.println("Baking...");
    }

    public void cut() {
        System.out.println("Cutting...");
    }

    public void box() {
        System.out.println("Boxing...");
    }

    protected Dough getDough(){
        return dough;
    }

    protected Sauce getSauce(){
        return sauce;
    }

    protected Cheese getCheese(){
        return cheese;
    }

    protected Clams getClams(){
        return clams;
    }
}