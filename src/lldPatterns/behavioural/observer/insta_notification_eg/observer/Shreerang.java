package lldPatterns.behavioural.observer.insta_notification_eg.observer;

public class Shreerang implements Subscribers{
    String str = "Shreerang";

    @Override
    public void update(String s) {
        System.out.println("Hi "+str+", Sarthak has posted his "+ s);
    }
}
