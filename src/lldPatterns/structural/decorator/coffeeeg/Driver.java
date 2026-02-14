package lldPatterns.structural.decorator.coffeeeg;

public class Driver {
    public static void main(String[] args){
        // black coffee
        Coffee c2 = new BlackCoffee();
        System.out.println("Black coffee: " + c2.cost());

        // milk coffee
        Coffee coffee = new MilkDecorator(new BlackCoffee());
        System.out.println("Black coffee with milk: "+coffee.cost());

        // sugar milk black coffee
        Coffee c1 = new SugarDecorator(new MilkDecorator(new BlackCoffee()));
        System.out.println("Black coffee with milk and sugar: "+c1.cost());

        //black coffee with extra sugar
        Coffee c3 = new SugarDecorator(new SugarDecorator(new BlackCoffee()));
        System.out.println("Black coffee with extra sugar: "+c3.cost());
    }
}
