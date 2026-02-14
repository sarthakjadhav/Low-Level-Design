package lldPatterns.creational.singleton;

public class SimpleSingleton {

    //EAGER INITIALIZATION
    private static final SimpleSingleton s = new SimpleSingleton();
    private SimpleSingleton(){}

    public static SimpleSingleton getInstance(){
        return s;
    }
}
