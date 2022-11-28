package experiment2.simplefactory.customer;

import experiment2.simplefactory.factory.Factory;

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.produceMeat("Pork");
        factory.produceMeat("Beef");
        factory.produceMeat("Chicken");
    }
}
