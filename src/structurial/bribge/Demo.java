package structurial.bribge;

import structurial.bribge.devices.Device;
import structurial.bribge.devices.Radio;
import structurial.bribge.devices.TV;
import structurial.bribge.remotes.AdvancedRemote;
import structurial.bribge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Test with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
