package lldPatterns.structural.decorator.burgereg;

public class KetchupDecorator extends BurgerDecorator{
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public int cost() {
        return burger.cost()+2;
    }
}
