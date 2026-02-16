package lldPatterns.behavioural.observer.insta_notification_eg.subjects;

import lldPatterns.behavioural.observer.insta_notification_eg.observer.Subscribers;

import java.util.*;

public class Sarthak implements Channels{
    List<String> videos = new ArrayList<>();
    List<Subscribers> subscribersList = new ArrayList<>();

    @Override
    public void add(Subscribers subscriber) {
        subscribersList.add(subscriber);
    }

    @Override
    public void remove(Subscribers subscriber) {
        subscribersList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscribers s:subscribersList){
            s.update(videos.get(videos.size() - 1));
        }
    }

    public void addVideo(String video){
        videos.add(video);
        notifySubscribers();
    }
}
