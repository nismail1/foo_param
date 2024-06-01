package foo_parameterization.examples;
import foo_parameterization.core.CalculatorFactory;
import foo_parameterization.core.VolumeCalculator;

public class ExampleUsage {
    public static void main(String[] args) {
        double radius = 5;

        // Using Foo parameterization
        VolumeCalculator fooCalculator = CalculatorFactory.createVolumeCalculator("Foo");
        double fooVolume = fooCalculator.calculateVolume(radius);
        System.out.println("The volume of the sphere with Foo parameterization and radius " + radius + " is: " + fooVolume);
    }
}
