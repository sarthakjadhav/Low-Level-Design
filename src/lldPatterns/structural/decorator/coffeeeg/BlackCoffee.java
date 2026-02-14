package lldPatterns.structural.decorator.coffeeeg;

public class BlackCoffee implements Coffee{
    @Override
    public int cost() {
        return 100;
    }
}
