package lldPatterns.creational.AbstractFactory.PizzaEg.aFactory;

import lldPatterns.creational.AbstractFactory.PizzaEg.pizza.*;

public class DominosPizzaFactory extends PizzaAFactory{

    @Override
    public Pizza getPizza(PizzaType type) {
        if(type.equals(PizzaType.MARGERITA)){
            return new Margarita();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new Veggie();
        }
        return null;
    }


}
