package lldPatterns.creational.Factory.Pizzaeg;

public class PizzaFactory {
    public Pizza getPizza(PizzaType type){
        if(type.equals(PizzaType.MARGERITA)){
            return new Margarita();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new Veggie();
        }
        return null;
    }
}
