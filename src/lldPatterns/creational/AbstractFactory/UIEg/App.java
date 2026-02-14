package lldPatterns.creational.AbstractFactory.UIEg;

import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Button;
import lldPatterns.creational.AbstractFactory.UIEg.AbstractProducts.Checkbox;
import lldPatterns.creational.AbstractFactory.UIEg.CoreAbstractFactory.UIFactory;

public class App {
    private Button button;
    private Checkbox checkbox;

    App(UIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    void paint(){
        button.paint();
        checkbox.paint();
    }
}
