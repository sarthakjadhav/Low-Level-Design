package lldPatterns.structural.bridge.tv_remote_eg;

public class AdvancedRemote extends Remote{
    public AdvancedRemote(Devices device) {
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

    public void setVolume(int x){
        device.setVolume(x);
    }

    public void mute(){
        System.out.println(device+" is muted.");
        device.setVolume(0);
    }
}
