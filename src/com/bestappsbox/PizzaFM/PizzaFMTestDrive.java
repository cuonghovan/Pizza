package com.bestappsbox.PizzaFM;

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
