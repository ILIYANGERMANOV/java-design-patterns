package patterns.adapter;

/**
 * Created by iliyan on 9/22/2016.
 */
public class SimpleUsbA implements UsbA{
    @Override
    public void connect() {
        System.out.println("UsbA is connected.");
    }
}
