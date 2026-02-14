package lldPatterns.creational.AbstractFactory.PizzaEg;

import lldPatterns.creational.AbstractFactory.PizzaEg.aFactory.DominosPizzaFactory;
import lldPatterns.creational.AbstractFactory.PizzaEg.aFactory.PizzaAFactory;
import lldPatterns.creational.AbstractFactory.PizzaEg.aFactory.PizzaHutPizzaFactory;

public class FactoryProvider {

    public PizzaAFactory getPizzaFactory(PizzaFactoryType type){
        return switch (type){
            case DOMINOS -> new DominosPizzaFactory();
            case PIZZA_HUT -> new PizzaHutPizzaFactory();
        };
    }
}
