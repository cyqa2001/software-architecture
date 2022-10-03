package experiment2.abstractfactory.factory.impl;

import experiment2.abstractfactory.factory.Factory;
import experiment2.abstractfactory.meat.beef.Beef;
import experiment2.abstractfactory.meat.beef.impl.AonongBeef;
import experiment2.abstractfactory.meat.chicken.Chicken;
import experiment2.abstractfactory.meat.chicken.impl.TianbangChicken;
import experiment2.abstractfactory.meat.pork.Pork;
import experiment2.abstractfactory.meat.pork.impl.AonongPork;

public class AonongFactory implements Factory{

    @Override
    public Pork producePork() {
        return new AonongPork();
    }

    @Override
    public Beef produceBeef() {
        return new AonongBeef();
    }

    @Override
    public Chicken produceChicken() {
        return new TianbangChicken();
    }
}
