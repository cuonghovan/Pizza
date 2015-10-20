package com.bestappsbox.PizzaAF;

/**
 * Created by cuonghv on 10/20/15.
 */
public class ThinCrustDough implements Dough{
    private String name;

    public ThinCrustDough(){
        name = "Thin Crust Dough";
    }

    @Override
    public String getName() {
        return name;
    }
}
