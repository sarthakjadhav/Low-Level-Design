package lldPatterns.creational.AbstractFactory.UIEg.ConcreteFactory;

import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Button;
import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Checkbox;
import lldPatterns.creational.AbstractFactory.UIEg.ConcreteProducts.WindowsButton;
import lldPatterns.creational.AbstractFactory.UIEg.ConcreteProducts.WindowsCheckbox;
import lldPatterns.creational.AbstractFactory.UIEg.CoreAbstractFactory.UIFactory;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
