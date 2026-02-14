package lldPatterns.structural.adapter.paymenteg;

import lldPatterns.structural.adapter.paymenteg.business_layer.PaymentInterface;
import lldPatterns.structural.adapter.paymenteg.business_layer.PaymentService;
import lldPatterns.structural.adapter.paymenteg.payment_factory.PaymentFactory;

public class PaymentApp {
    private static PaymentInterface service;

//    static {
//        PaymentProcessor processor = PaymentFactory.getPaymentProcessor("razorpay");
//
//        service = new PaymentService(processor);
//    }

    public static void pay(String sender, String receiver, int amt, String type){
        service  = new PaymentService(PaymentFactory.getPaymentProcessor(type));
        service.processPayment(sender, receiver, amt);
    }
}
