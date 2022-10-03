package experiment2.factorymethod.factory.impl;

import experiment2.factorymethod.factory.MeatFactory;
import experiment2.factorymethod.meat.Meat;
import experiment2.factorymethod.meat.impl.Chicken;

public class ChickenMeatFactory implements MeatFactory {
    @Override
    public Meat produceMeat() {
        return new Chicken();
    }
}
