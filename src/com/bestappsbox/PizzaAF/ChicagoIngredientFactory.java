package com.bestappsbox.PizzaAF;

/**
 * Created by cuonghv on 10/20/15.
 */
public class ChicagoIngredientFactory implements IngredientFactory{
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
