package lldPatterns.structural.bridge.tv_remote_eg;

public interface Devices {
    int volume = 0;
    public void turnOn();
    public void turnOff();
    public void volumeUp();
    public void volumeDown();
    public void setVolume(int x);
    public int getVolume();
}
