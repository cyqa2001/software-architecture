package experiment2.factorymethod.meat.impl;

import experiment2.factorymethod.meat.Meat;

public class Beef implements Meat {
    public Beef() {
        System.out.println("生产-->牛肉");
    }
}
