package com.bestappsbox.PizzaAF;

/**
 * Created by cuonghv on 10/20/15.
 */
public class CheesePizza extends Pizza {
    private IngredientFactory ingredientFactory;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;

    public CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
    @Override
    public void prepare() {
        System.out.println("Preparing...");
        System.out.println("Adding " + dough.getName() + "...");
        System.out.println("Adding " + sauce.getName() + "...");
        System.out.println("Adding " + cheese.getName() + "...");
    }
}
