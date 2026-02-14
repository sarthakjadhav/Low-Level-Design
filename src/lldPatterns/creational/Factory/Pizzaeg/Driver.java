package lldPatterns.creational.Factory.Pizzaeg;

public class Driver {
    public static void main(String[] ar){
        PizzaFactory pf = new PizzaFactory();
        Pizza v = pf.getPizza(PizzaType.VEGGIE);
        v.eat();
        Pizza m = pf.getPizza(PizzaType.MARGERITA);
        m.eat();
    }
}
