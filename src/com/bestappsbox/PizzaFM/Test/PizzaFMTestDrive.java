package com.bestappsbox.PizzaFM.Test;

import com.bestappsbox.PizzaFM.PizzaStore.ChicagoPizzaStore;
import com.bestappsbox.PizzaFM.PizzaStore.NYPizzaStore;
import com.bestappsbox.PizzaFM.PizzaStore.PizzaStore;

/**
 * Created by cuonghv on 10/20/15.
 */
public class PizzaFMTestDrive {
    public static void main (String args[]){
        System.out.println("Order Chicago style clam pizza");
        PizzaStore chicagoPizzaFactory = new ChicagoPizzaStore();
        chicagoPizzaFactory.orderPizza("clam");

        System.out.println("Order New York style cheese pizza");
        PizzaStore NYPizzaFactory = new NYPizzaStore();
        NYPizzaFactory.orderPizza("cheese");
    }
}
