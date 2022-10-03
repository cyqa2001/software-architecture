package experiment2.simplefactory.customer;

import experiment2.simplefactory.factory.Factory;
import experiment2.simplefactory.meat.impl.Beef;
import experiment2.simplefactory.meat.impl.Chicken;
import experiment2.simplefactory.meat.impl.Pork;

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.produceMeat("Pork");
        factory.produceMeat("Beef");
        factory.produceMeat("Chicken");
    }
}
