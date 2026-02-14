package lldPatterns.creational.Factory.Billeg;

public class CommercialBill implements Bill{

    @Override
    public void generate() {
        System.out.println("This is Commercial Bill...");
    }
}
