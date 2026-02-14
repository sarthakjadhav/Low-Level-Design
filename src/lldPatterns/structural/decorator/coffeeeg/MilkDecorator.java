package lldPatterns.structural.decorator.coffeeeg;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super((coffee));
    }

    @Override
    public int cost() {
        return coffee.cost()+50;
    }
}
