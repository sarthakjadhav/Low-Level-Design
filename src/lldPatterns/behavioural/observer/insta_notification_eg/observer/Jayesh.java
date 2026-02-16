package lldPatterns.behavioural.observer.insta_notification_eg.observer;

public class Jayesh implements Subscribers{
    String str = "Jayesh";

    @Override
    public void update(String s) {
        System.out.println("Hi "+str+", Sarthak has posted his "+ s);
    }
}
