package lldPatterns.creational.AbstractFactory.UIEg.ConcreteProducts;

import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac checkbox painted");
    }
}
