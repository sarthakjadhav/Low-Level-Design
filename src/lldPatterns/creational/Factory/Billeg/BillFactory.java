package lldPatterns.creational.Factory.Billeg;

public class BillFactory {

    public Bill getBill(String type){
        if(type.equalsIgnoreCase("domestic")){
            return new DomesticBill();
        } else if (type.equalsIgnoreCase("commercial")) {
            return new CommercialBill();
        }
        return null;
    }
}
