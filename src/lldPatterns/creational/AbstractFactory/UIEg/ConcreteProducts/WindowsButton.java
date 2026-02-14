package lldPatterns.creational.AbstractFactory.UIEg.ConcreteProducts;

import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button painted");
    }
}
