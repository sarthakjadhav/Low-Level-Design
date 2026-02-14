package lldPatterns.structural.adapter.paymenteg;

public interface PaymentProcessor {
    boolean pay(String senderID, String receiverID, int amt);
}
