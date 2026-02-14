package lldPatterns.structural.bridge.tv_remote_eg;

public class Driver {
    public static void main(String[] args){
        Devices device = new TV();
        Remote basicRemote = new BasicRemote(device);
        basicRemote.turnOn();
        System.out.println("Volume is "+basicRemote.device.getVolume());
        basicRemote.volumeUp();
        System.out.println("Volume is "+basicRemote.device.getVolume());
        basicRemote.volumeDown();
        System.out.println("Volume is "+basicRemote.device.getVolume());
        basicRemote.turnOff();

        Devices device1 = new Radio();
        Remote advancedRemote = new AdvancedRemote(device1);
        advancedRemote.turnOn();
        System.out.println("Volume is "+advancedRemote.device.getVolume());
        advancedRemote.volumeUp();
        System.out.println("Volume is "+advancedRemote.device.getVolume());
        advancedRemote.volumeDown();
        System.out.println("Volume is "+advancedRemote.device.getVolume());
        ((AdvancedRemote) advancedRemote).setVolume(20);
        System.out.println("Volume is "+advancedRemote.device.getVolume());
        advancedRemote.volumeDown();
        System.out.println("Volume is "+advancedRemote.device.getVolume());
        ((AdvancedRemote) advancedRemote).mute();
        System.out.println("Volume is "+advancedRemote.device.getVolume());
        advancedRemote.turnOff();
    }
}
