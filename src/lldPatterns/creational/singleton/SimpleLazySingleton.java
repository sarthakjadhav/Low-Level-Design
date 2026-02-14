package lldPatterns.creational.singleton;

public class SimpleLazySingleton {
    private static SimpleLazySingleton INSTANCE;

    private SimpleLazySingleton(){
        System.out.println("Obj created by "+ Thread.currentThread().getName());
    }
    // Initialized on 1st call...
    public static SimpleLazySingleton getINSTANCE() {
        if(INSTANCE != null) return INSTANCE;

        synchronized (SimpleLazySingleton.class){
            if(INSTANCE != null) return INSTANCE;
            INSTANCE = new SimpleLazySingleton();
        }
        System.out.println(" Obj is "+INSTANCE);

        return INSTANCE;
    }
} // this code is Lazy loaded and thread safe also.
