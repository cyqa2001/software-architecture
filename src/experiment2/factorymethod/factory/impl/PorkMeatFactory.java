package experiment2.factorymethod.factory.impl;

import experiment2.factorymethod.factory.MeatFactory;
import experiment2.factorymethod.meat.Meat;
import experiment2.factorymethod.meat.impl.Pork;

public class PorkMeatFactory implements MeatFactory {
    @Override
    public Meat produceMeat() {
        System.out.println("猪肉工厂：");
        return new Pork();
    }
}