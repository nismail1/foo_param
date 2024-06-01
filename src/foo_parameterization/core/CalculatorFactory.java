package foo_parameterization.core;
/*
 * Factory class to create volume calculator instances based on parameterization type.
 */

public class CalculatorFactory {
    public static VolumeCalculator createVolumeCalculator(String type) {
        switch (type) {
            case "Foo":
                return new FooVolumeCalculator(new FooTransformation());
            default:
                throw new IllegalArgumentException("Unknown calculator type: " + type);
        }
    }
}
