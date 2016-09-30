package patterns.adapter;

/**
 * Created by iliyan on 9/22/2016.
 */
public class SimpleUsbC implements UsbC {
    @Override
    public void connect() {
        System.out.println("UsbC is connected.");
    }
}
