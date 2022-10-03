package experiment2.abstractfactory.factory;

import experiment2.abstractfactory.meat.beef.Beef;
import experiment2.abstractfactory.meat.chicken.Chicken;
import experiment2.abstractfactory.meat.pork.Pork;

public interface Factory {
    Pork producePork();
    Beef produceBeef();
    Chicken produceChicken();
}
