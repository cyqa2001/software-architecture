package experiment2.factorymethod.customer;

import experiment2.factorymethod.factory.impl.BeefMeatFactory;
import experiment2.factorymethod.factory.impl.ChickenMeatFactory;
import experiment2.factorymethod.factory.impl.PorkMeatFactory;

public class Customer {
    public static void main(String[] args) {
        PorkMeatFactory porkMeatFactory = new PorkMeatFactory();
        porkMeatFactory.produceMeat();

        System.out.println();

        BeefMeatFactory beefMeatFactory = new BeefMeatFactory();
        beefMeatFactory.produceMeat();

        System.out.println();

        ChickenMeatFactory chickenMeatFactory = new ChickenMeatFactory();
        chickenMeatFactory.produceMeat();
    }
}
