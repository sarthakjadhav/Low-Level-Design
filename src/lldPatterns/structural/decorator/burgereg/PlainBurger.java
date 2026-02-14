package lldPatterns.structural.decorator.burgereg;

public class PlainBurger implements Burger{
    @Override
    public int cost() {
        return 80;
    }
}
