package foo_parameterization;

import foo_parameterization.core.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar foo-parameterization.jar <radius>");
            System.exit(1);
        }

        try {
            double radius = Double.parseDouble(args[0]);
            VolumeCalculator volumeCalculator = CalculatorFactory.createVolumeCalculator("Foo");
            double volume = volumeCalculator.calculateVolume(radius);
            System.out.println("Calculated volume for radius " + radius + ": " + volume);
        } catch (NumberFormatException e) {
            System.out.println("Invalid radius. Please provide a valid number.");
        }
    }
}
