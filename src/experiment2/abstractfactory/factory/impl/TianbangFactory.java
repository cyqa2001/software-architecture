package experiment2.abstractfactory.factory.impl;

import experiment2.abstractfactory.factory.Factory;
import experiment2.abstractfactory.meat.beef.Beef;
import experiment2.abstractfactory.meat.beef.impl.TianbangBeef;
import experiment2.abstractfactory.meat.chicken.Chicken;
import experiment2.abstractfactory.meat.chicken.impl.TianbangChicken;
import experiment2.abstractfactory.meat.pork.Pork;
import experiment2.abstractfactory.meat.pork.impl.TianbangPork;

public class TianbangFactory implements Factory {
    @Override
    public Pork producePork() {
        return new TianbangPork();
    }

    @Override
    public Beef produceBeef() {
        return new TianbangBeef();
    }

    @Override
    public Chicken produceChicken() {
        return new TianbangChicken();
    }
}
