package lldPatterns.creational.AbstractFactory.PizzaEg.pizza;

public class DoubleCheeseMargerita implements Pizza{
    @Override
    public String getName() {
        return "Here is your Double Cheese Margerita from PizzHut...";
    }

    @Override
    public void eat() {
        System.out.println("Eating Double cheese margerita...");
    }
}
