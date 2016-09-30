package app.samples;

import app.Sample;
import patterns.proxy.ProxyImage;

/**
 * Created by iliyan on 9/26/2016.
 */
public class ProxyPatternSample implements Sample {
    @Override
    public String getTitle() {
        return "Proxy pattern";
    }

    @Override
    public void execute() {
        ProxyImage image1 = new ProxyImage("storage/img1.png");
        ProxyImage image2 = new ProxyImage("storage/img2.png");

        image1.displayImage();
        image2.displayImage();
        System.out.println();
        image1.displayImage();
        image2.displayImage();
    }
}
