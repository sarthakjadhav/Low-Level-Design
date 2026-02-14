package lldPatterns.structural.decorator.burgereg;

public class CokeDecorator extends BurgerDecorator {
    public CokeDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public int cost() {
        return burger.cost()+70;
    }
}
