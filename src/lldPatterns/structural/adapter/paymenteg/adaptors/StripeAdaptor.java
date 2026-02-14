package lldPatterns.structural.adapter.paymenteg.adaptors;

import lldPatterns.structural.adapter.paymenteg.PaymentProcessor;
import lldPatterns.structural.adapter.paymenteg.third_party_api.StripeGateway;

public class StripeAdaptor implements PaymentProcessor {
    StripeGateway stripeGateway;

    public StripeAdaptor(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public boolean pay(String senderID, String receiverID, int amt) {
        String transactionId = senderID + "_TO_" + receiverID;
        return stripeGateway.charge(transactionId,amt);
    }
}
