package lldPatterns.structural.decorator.burgereg;

public abstract class BurgerDecorator implements Burger{
    protected Burger burger;
    public BurgerDecorator(Burger burger){
        this.burger =burger;
    }
}
