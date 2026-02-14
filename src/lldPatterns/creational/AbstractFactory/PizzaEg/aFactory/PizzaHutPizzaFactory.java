package lldPatterns.creational.AbstractFactory.PizzaEg.aFactory;

import lldPatterns.creational.AbstractFactory.PizzaEg.pizza.*;

public class PizzaHutPizzaFactory extends PizzaAFactory{

    @Override
    public Pizza getPizza(PizzaType type) {
        if(type.equals(PizzaType.MARGERITA)){
            return new DoubleCheeseMargerita();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new VeggieParadise();
        }
        return null;
    }
}
