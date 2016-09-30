package patterns.adapter;

/**
 * Created by iliyan on 9/22/2016.
 */
public class UsbCAdapter implements UsbA {
    private UsbC usbC;

    public UsbCAdapter(UsbC usbC) {
        this.usbC = usbC;
    }

    @Override
    public void connect() {
        System.out.println("Adapter plugged in.");
        usbC.connect();
    }
}
