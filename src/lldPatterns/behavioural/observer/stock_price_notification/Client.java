package lldPatterns.behavioural.observer.stock_price_notification;

import lldPatterns.behavioural.observer.stock_price_notification.Observer.MobileApp;
import lldPatterns.behavioural.observer.stock_price_notification.Observer.Observer;
import lldPatterns.behavioural.observer.stock_price_notification.Observer.WebApp;
import lldPatterns.behavioural.observer.stock_price_notification.subject.Stock;

public class Client {
    public static void main(String[] args) {

        Stock stock = new Stock();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stock.attach(mobile);
        stock.attach(web);

        stock.setPrice(1000);
        stock.setPrice(1200);
    }
}
