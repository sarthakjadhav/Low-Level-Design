package lldPatterns.creational.AbstractFactory.PizzaEg.aFactory;

import lldPatterns.creational.AbstractFactory.PizzaEg.pizza.Pizza;
import lldPatterns.creational.AbstractFactory.PizzaEg.pizza.PizzaType;

public abstract class PizzaAFactory {
    public abstract Pizza getPizza(PizzaType pt);
}
