package lldPatterns.creational.AbstractFactory.UIEg.ConcreteProducts;

import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac button painted");
    }
}
