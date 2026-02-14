package lldPatterns.structural.adapter.paymenteg.payment_factory;

import lldPatterns.structural.adapter.paymenteg.PaymentProcessor;
import lldPatterns.structural.adapter.paymenteg.adaptors.RazorpayAdaptor;
import lldPatterns.structural.adapter.paymenteg.adaptors.StripeAdaptor;
import lldPatterns.structural.adapter.paymenteg.third_party_api.RazorpayGateway;
import lldPatterns.structural.adapter.paymenteg.third_party_api.StripeGateway;

public class PaymentFactory {

    public static PaymentProcessor getPaymentProcessor(String type){
        if(type.equalsIgnoreCase("razorpay")){
            return new RazorpayAdaptor(new RazorpayGateway());
        }
        if(type.equalsIgnoreCase("stripe")){
            return new StripeAdaptor(new StripeGateway());
        }
        throw new IllegalArgumentException("Invalid paayment type...");
    }
}
