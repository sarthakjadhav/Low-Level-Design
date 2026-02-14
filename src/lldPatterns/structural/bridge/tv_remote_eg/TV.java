package lldPatterns.structural.bridge.tv_remote_eg;

public class TV implements Devices{
    public int volume;

    @Override
    public void turnOn() {
        System.out.println("TV turned ON...");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF...");
    }

    @Override
    public void volumeUp() {
        volume++;
    }

    @Override
    public void volumeDown() {
        volume--;
    }

    @Override
    public void setVolume(int x) {
        volume = x;
    }

    @Override
    public int getVolume() {
        return volume;
    }

}
