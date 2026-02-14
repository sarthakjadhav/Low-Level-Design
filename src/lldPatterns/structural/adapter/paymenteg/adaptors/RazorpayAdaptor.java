package lldPatterns.structural.adapter.paymenteg.adaptors;

import lldPatterns.structural.adapter.paymenteg.PaymentProcessor;
import lldPatterns.structural.adapter.paymenteg.third_party_api.RazorpayGateway;

public class RazorpayAdaptor implements PaymentProcessor {
    private RazorpayGateway razorpayGateway;

    public RazorpayAdaptor(RazorpayGateway razorpayGateway){
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public boolean pay(String senderID, String receiverID, int amt) {
        return razorpayGateway.makePayment(senderID,receiverID,amt);
    }
}
