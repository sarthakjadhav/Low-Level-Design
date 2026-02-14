package lldPatterns.creational.singleton;

public class StaticSingletion
{
    private static final StaticSingletion INSTANCE;

    // Eager Initialization - static initialization block
    static {
        INSTANCE  = new StaticSingletion();
    }

    private StaticSingletion(){}

    public static StaticSingletion getINSTANCE() {
        return INSTANCE;
    }
}
