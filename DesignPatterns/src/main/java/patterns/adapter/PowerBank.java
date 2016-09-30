package patterns.adapter;

/**
 * Created by iliyan on 9/22/2016.
 */
public class PowerBank {
    private UsbA usbA;

    public PowerBank(UsbA usbA) {
        this.usbA = usbA;
    }

    public void charge() {
        usbA.connect();
        System.out.println("PowerBank is charging!");
    }
}
