package lldPatterns.structural.adapter.paymenteg.business_layer;

public interface PaymentInterface {
    public void processPayment(String sender, String receiver, int amt);
}
