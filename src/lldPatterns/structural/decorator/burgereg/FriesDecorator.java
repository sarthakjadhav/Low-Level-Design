package lldPatterns.structural.decorator.burgereg;

public class FriesDecorator extends BurgerDecorator {
    public FriesDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public int cost() {
        return burger.cost()+ 60;
    }
}
