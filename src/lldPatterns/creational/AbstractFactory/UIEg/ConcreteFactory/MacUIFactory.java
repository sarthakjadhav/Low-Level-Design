package lldPatterns.creational.AbstractFactory.UIEg.ConcreteFactory;

import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Button;
import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Checkbox;
import lldPatterns.creational.AbstractFactory.UIEg.ConcreteProducts.MacButton;
import lldPatterns.creational.AbstractFactory.UIEg.ConcreteProducts.MacCheckbox;
import lldPatterns.creational.AbstractFactory.UIEg.CoreAbstractFactory.UIFactory;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
