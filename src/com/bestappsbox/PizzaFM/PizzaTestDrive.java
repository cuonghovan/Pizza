package com.bestappsbox.PizzaFM;

/**
 * Created by cuonghv on 10/20/15.
 */
public class PizzaTestDrive {
    public static void main (String args[]){
        System.out.println("Order Chicago style clam pizza");
        PizzaStore chicagoPizzaFactory = new ChicagoPizzaFactory();
        chicagoPizzaFactory.orderPizza("clam");

        System.out.println("Order New York style cheese pizza");
        PizzaStore NYPizzaFactory = new NYPizzaFactory();
        NYPizzaFactory.orderPizza("cheese");
    }
}
