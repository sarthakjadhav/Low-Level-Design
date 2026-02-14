package lldPatterns.creational.AbstractFactory.UIEg.CoreAbstractFactory;

import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Button;
import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
