package app;

import java.util.Stack;

/**
 * Created by iliyan on 9/21/2016.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stack<Sample> samples = SampleFactory.getSamples();
        Sample currentSample;
        while (!samples.isEmpty()) {
            currentSample = samples.pop();
            System.out.println("Executing \"" + currentSample.getTitle() + "\" sample:");
            currentSample.execute();
            System.out.println("----------------------------------------------");
        }
    }
}
