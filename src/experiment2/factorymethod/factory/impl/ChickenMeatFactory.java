package experiment2.factorymethod.factory.impl;

import experiment2.factorymethod.factory.MeatFactory;
import experiment2.factorymethod.meat.Meat;
import experiment2.factorymethod.meat.impl.Chicken;

public class ChickenMeatFactory implements MeatFactory {
    @Override
    public Meat produceMeat() {
        System.out.println("鸡肉工厂：");
        return new Chicken();
    }
}
