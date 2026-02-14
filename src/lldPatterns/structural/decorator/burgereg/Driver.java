package lldPatterns.structural.decorator.burgereg;

public class Driver {
    public static void main(String[] args){
        Burger burger = new FriesDecorator(
                new KetchupDecorator(
                        new CokeDecorator(
                                new PattyDecorator(
                                        new PlainBurger()
                                )
                        )
                )
        );

        System.out.println(burger.cost());
    }
}
