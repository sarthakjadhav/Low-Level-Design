package lldPatterns.creational.AbstractFactory.UIEg;

import lldPatterns.creational.AbstractFactory.UIEg.ConcreteFactory.MacUIFactory;
import lldPatterns.creational.AbstractFactory.UIEg.ConcreteFactory.WindowsUIFactory;
import lldPatterns.creational.AbstractFactory.UIEg.CoreAbstractFactory.UIFactory;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UIFactory factory;
        String os;
        os = sc.nextLine();
        if(os.equalsIgnoreCase("windows")){
            factory = new WindowsUIFactory();
        }else {
            factory = new MacUIFactory();
        }

        App app = new App(factory);
        app.paint();
    }
}
