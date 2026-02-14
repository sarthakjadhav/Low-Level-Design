

import lldPatterns.creational.Factory.Billeg.Bill;
import lldPatterns.creational.Factory.Billeg.BillFactory;

public class Driver {
    public static void main(String[] args){
        BillFactory pf = new BillFactory();

        Bill d = pf.getBill("domestic");
        d.generate();

        Bill c = pf.getBill("commercial");
        c.generate();
    }
}
