package com.bestappsbox.PizzaAF.Test;

import com.bestappsbox.PizzaAF.PizzaStore.ChicagoPizzaStore;
import com.bestappsbox.PizzaAF.PizzaStore.NYPizzaStore;
import com.bestappsbox.PizzaAF.PizzaStore.PizzaStore;

/**
 * Created by cuonghv on 10/20/15.
 */
public class PizzaAFTestDrive {
    public static void main (String args[]){
        System.out.println("Order Chicago style clam pizza");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("clam");

        System.out.println("Order New York style cheese pizza");
        PizzaStore NYPizzaStore = new NYPizzaStore();
        NYPizzaStore.orderPizza("cheese");
    }
}
