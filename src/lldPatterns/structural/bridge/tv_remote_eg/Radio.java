package lldPatterns.structural.bridge.tv_remote_eg;

public class Radio implements Devices{
    int volume;

    @Override
    public void turnOn() {
        System.out.println("Radio turned ON...");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned OFF...");
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
