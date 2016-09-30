package patterns.proxy;

/**
 * Created by iliyan on 9/26/2016.
 */
public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
        realImage = null;
    }

    @Override
    public void displayImage() {
        if(realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayImage();
    }
}
