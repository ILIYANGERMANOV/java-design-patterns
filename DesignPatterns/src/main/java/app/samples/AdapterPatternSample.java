package app.samples;

import app.Sample;
import patterns.adapter.PowerBank;
import patterns.adapter.SimpleUsbA;
import patterns.adapter.SimpleUsbC;
import patterns.adapter.UsbCAdapter;

/**
 * Created by iliyan on 9/22/2016.
 */
public class AdapterPatternSample implements Sample{
    @Override
    public String getTitle() {
        return "Adapter pattern";
    }

    @Override
    public void execute() {
        PowerBank usbAPowerBank = new PowerBank(new SimpleUsbA());
        usbAPowerBank.charge();
        System.out.println();
        UsbCAdapter usbCAdapter = new UsbCAdapter(new SimpleUsbC());
        PowerBank usbCPowerBank = new PowerBank(usbCAdapter);
        usbCPowerBank.charge();
    }
}
