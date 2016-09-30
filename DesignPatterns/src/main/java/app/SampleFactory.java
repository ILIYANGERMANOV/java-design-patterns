package app;

import app.samples.*;

import java.util.Stack;

/**
 * Created by iliyan on 9/22/2016.
 */
public class SampleFactory {
    public static Stack<Sample> getSamples() {
        Stack<Sample> samples = new Stack<>();
        samples.push(new DecoratorPatternSample());
        samples.push(new AbstractFactoryPatternSample());
        samples.push(new AdapterPatternSample());
        samples.push(new BridgePatternSample());
        samples.push(new ChainOfResponsibilitySample());
        samples.push(new CompositePatternSample());
        samples.push(new ProxyPatternSample());
        return samples;
    }
}
