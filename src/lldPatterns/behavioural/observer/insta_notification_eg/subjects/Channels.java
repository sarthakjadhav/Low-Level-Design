package lldPatterns.behavioural.observer.insta_notification_eg.subjects;

import lldPatterns.behavioural.observer.insta_notification_eg.observer.Subscribers;

public interface Channels {
    void add(Subscribers subscriber);
    void remove(Subscribers subscriber);
    void notifySubscribers();
}
