package lldPatterns.behavioural.observer.insta_notification_eg.observer;

public class Aniket implements Subscribers{
    String str = "Aniket";
    @Override
    public void update(String s) {
        System.out.println( "Hi "+str +", Sarthak has posted his "+ s);
    }
}
