package lldPatterns.creational.Factory.Billeg;

public class DomesticBill implements Bill{
    @Override
    public void generate(){
        System.out.println("This is Domestic Bill...");
    }
}
