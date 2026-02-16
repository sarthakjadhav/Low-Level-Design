package lldPatterns.behavioural.observer.insta_notification_eg;

import lldPatterns.behavioural.observer.insta_notification_eg.observer.Aniket;
import lldPatterns.behavioural.observer.insta_notification_eg.observer.Jayesh;
import lldPatterns.behavioural.observer.insta_notification_eg.observer.Shreerang;
import lldPatterns.behavioural.observer.insta_notification_eg.observer.Subscribers;
import lldPatterns.behavioural.observer.insta_notification_eg.subjects.Sarthak;

public class Client {
    public static void main(String[] args) {
        Subscribers aniket = new Aniket();
        Subscribers shreerang = new Shreerang();
        Subscribers jayesh = new Jayesh();

        Sarthak sarthak = new Sarthak();

        sarthak.add(aniket);
        sarthak.add(shreerang);
        sarthak.add(jayesh);

        sarthak.addVideo("1st video.");
        sarthak.addVideo("2nd video.");
        sarthak.addVideo("3rd video.");
    }
}
