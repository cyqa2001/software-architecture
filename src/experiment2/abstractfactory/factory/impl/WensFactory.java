package experiment2.abstractfactory.factory.impl;

import experiment2.abstractfactory.factory.Factory;
import experiment2.abstractfactory.meat.beef.Beef;
import experiment2.abstractfactory.meat.beef.impl.WensBeef;
import experiment2.abstractfactory.meat.chicken.Chicken;
import experiment2.abstractfactory.meat.chicken.impl.WensChicken;
import experiment2.abstractfactory.meat.pork.Pork;
import experiment2.abstractfactory.meat.pork.impl.WensPork;

public class WensFactory implements Factory {
    @Override
    public Pork producePork() {
        return new WensPork();
    }

    @Override
    public Beef produceBeef() {
        return new WensBeef();
    }

    @Override
    public Chicken produceChicken() {
        return new WensChicken();
    }
}
