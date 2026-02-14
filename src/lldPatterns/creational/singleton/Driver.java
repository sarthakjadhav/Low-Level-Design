package lldPatterns.creational.singleton;

public class Driver {

    public static void main(String[] args){
        Thread t1  = new Thread(SimpleLazySingleton::getINSTANCE,"t1");

        Thread t2 = new Thread(SimpleLazySingleton::getINSTANCE,"t2");

        t1.start();
        t2.start();
        System.out.println();
        System.out.println("Bill pugh below");
        Thread t3  = new Thread(BillPughSingleton::getInstance,"t3");

        Thread t4 = new Thread(BillPughSingleton::getInstance,"t4");

        t3.start();
        t4.start();
    }
}
