package experiment2.abstractfactory.customer;

import experiment2.abstractfactory.factory.impl.AonongFactory;
import experiment2.abstractfactory.factory.impl.TianbangFactory;
import experiment2.abstractfactory.factory.impl.WensFactory;

public class Customer {
    public static void main(String[] args) {
        WensFactory wensFactory = new WensFactory();
        System.out.println("温氏工厂：");
        wensFactory.producePork();
        wensFactory.produceBeef();
        wensFactory.produceChicken();

        System.out.println();

        TianbangFactory tianbangFactory = new TianbangFactory();
        System.out.println("天邦工厂：");
        tianbangFactory.producePork();
        tianbangFactory.produceBeef();
        tianbangFactory.produceChicken();

        System.out.println();

        AonongFactory aonongFactory = new AonongFactory();
        System.out.println("傲农工厂：");
        aonongFactory.producePork();
        aonongFactory.produceBeef();
        aonongFactory.produceChicken();
    }
}
