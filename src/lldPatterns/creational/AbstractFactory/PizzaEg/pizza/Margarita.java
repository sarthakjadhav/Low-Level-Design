package lldPatterns.creational.AbstractFactory.PizzaEg.pizza;



public class Margarita implements Pizza{
    @Override
    public void eat() {
        System.out.println("Margerita...");
    }

    @Override
    public String getName() {
        return "Here is your Margerita from Dominos...";
    }
}
