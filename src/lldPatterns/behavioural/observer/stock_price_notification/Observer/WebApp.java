package lldPatterns.behavioural.observer.stock_price_notification.Observer;

public class WebApp implements Observer{
    @Override
    public void update(double price) {
        System.out.println("WebApp is notified that new stock price is "+price);
    }
}
