package patterns.proxy;

/**
 * Created by iliyan on 9/26/2016.
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        System.out.println("Loading image: " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying image: " + filename);
    }
}
