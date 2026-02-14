package lldPatterns.structural.adapter.paymenteg.third_party_api;

public class RazorpayGateway {

    public boolean makePayment(String from, String to, int amt) {
        System.out.println("Razorpay transfer");
        System.out.println("from "+ from);
        System.out.println("to "+ to);
        System.out.println("amount "+ amt);
        return true;
    }
}
