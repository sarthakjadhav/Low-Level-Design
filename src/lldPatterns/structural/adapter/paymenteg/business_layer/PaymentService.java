package lldPatterns.structural.adapter.paymenteg.business_layer;

import lldPatterns.structural.adapter.paymenteg.PaymentProcessor;

public class PaymentService implements PaymentInterface{
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(String sender, String receiver, int amt){
        System.out.println("Initiating payment...");
        boolean success = paymentProcessor.pay(sender, receiver, amt);

        if(success){
            System.out.println("Payment successful...");
        }else{
            System.out.println("Payment failed...");
        }

    }
}
