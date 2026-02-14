package lldPatterns.structural.adapter.paymenteg;

import lldPatterns.structural.adapter.paymenteg.payment_factory.PaymentFactory;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        String sender = "123";
        String receiver = "456";
        int amt = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type true for stripe & false for razorpay: ");
        System.out.println();
        boolean stripe = sc.nextBoolean();
        if(stripe) PaymentApp.pay(sender,receiver,amt,"stripe");
        else PaymentApp.pay(sender,receiver,amt,"razorpay");
    }
}
