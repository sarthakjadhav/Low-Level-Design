package lldPatterns.behavioural.observer.stock_price_notification.subject;

import lldPatterns.behavioural.observer.stock_price_notification.Observer.Observer;

import java.util.*;

public class Stock implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private double price;

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Double price) {
        for (Observer o : observers) {
            o.update(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);   // notify on state change
    }


}
