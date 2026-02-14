package lldPatterns.creational.AbstractFactory.PizzaEg.pizza;

public class VeggieParadise implements Pizza{

    @Override
    public String getName() {
        return "Here is your Veggie Paradise from Pizzhut";
    }

    @Override
    public void eat() {
        System.out.println("Eating Veggie Paradise... ");
    }
}
