package lldPatterns.creational.AbstractFactory.PizzaEg.pizza;


public class Veggie implements Pizza {
    @Override
    public void eat() {
        System.out.println("Veggie...");
    }

    @Override
    public String getName() {
        return "Here is your Veggie from Dominos...";
    }
}
