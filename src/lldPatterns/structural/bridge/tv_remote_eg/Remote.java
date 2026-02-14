package lldPatterns.structural.bridge.tv_remote_eg;

public abstract class Remote {
    protected Devices device;

    public Remote(Devices device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }

    public abstract void volumeUp();
    public abstract void volumeDown();
}
