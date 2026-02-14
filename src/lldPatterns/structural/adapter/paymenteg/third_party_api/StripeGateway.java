package lldPatterns.structural.adapter.paymenteg.third_party_api;

public class StripeGateway {
    public boolean charge(String transactionId,int amt){
        System.out.println("Stripe transfer");
        System.out.println("Transaction ID: "+ transactionId);
        System.out.println("Amount "+amt);
        return true;
    }
}
