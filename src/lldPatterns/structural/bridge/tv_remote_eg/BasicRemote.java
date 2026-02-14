package lldPatterns.structural.bridge.tv_remote_eg;

public class BasicRemote extends Remote{
    public BasicRemote(Devices device) {
        super(device);
    }

    @Override
    public void volumeUp() {
        device.volumeUp();
    }

    @Override
    public void volumeDown() {
        device.volumeDown();
    }
}
