package lldPatterns.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class Helper{
        private static final BillPughSingleton INST = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        System.out.println("obj "+ Helper.INST +" created by:" + Thread.currentThread().getName());
        return Helper.INST;
    }
}
