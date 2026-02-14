package lldPatterns.creational.AbstractFactory.PizzaEg;

import lldPatterns.creational.AbstractFactory.PizzaEg.aFactory.PizzaAFactory;
import lldPatterns.creational.AbstractFactory.PizzaEg.pizza.*;

public class Driver {

    public static void main(String[] args){
        FactoryProvider factoryProvider = new FactoryProvider();
        PizzaAFactory dominosFactory = factoryProvider.getPizzaFactory(PizzaFactoryType.DOMINOS);
        PizzaAFactory pizzHutFactory = factoryProvider.getPizzaFactory(PizzaFactoryType.PIZZA_HUT);

        Pizza pizza1 = dominosFactory.getPizza(PizzaType.VEGGIE);
        Pizza pizza2 = dominosFactory.getPizza(PizzaType.MARGERITA);

        Pizza pizza3 = pizzHutFactory.getPizza(PizzaType.VEGGIE);
        Pizza pizza4 = pizzHutFactory.getPizza(PizzaType.MARGERITA);

        System.out.println(pizza1.getName());
        pizza1.eat();

        System.out.println(pizza2.getName());
        pizza2.eat();

        System.out.println(pizza3.getName());
        pizza3.eat();

        System.out.println(pizza4.getName());
        pizza4.eat();

    }
}
