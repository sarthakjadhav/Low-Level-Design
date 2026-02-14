package lldPatterns.structural.decorator.burgereg;

// extra patty
public class PattyDecorator extends BurgerDecorator{
    public PattyDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public int cost() {
        return burger.cost()+40;
    }
}
