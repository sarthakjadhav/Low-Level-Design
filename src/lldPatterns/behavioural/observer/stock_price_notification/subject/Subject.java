package lldPatterns.behavioural.observer.stock_price_notification.subject;

import lldPatterns.behavioural.observer.stock_price_notification.Observer.Observer;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(Double price);
}
