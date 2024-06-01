package foo_parameterization.core;

/**
 * FooVolumeCalculator is an implementation of VolumeCalculator that
 * applies a specified transformation to the radius before calculating
 * the volume of a sphere using the transformed radius.
 */
public class FooVolumeCalculator implements VolumeCalculator {

    private final Transformation transformation;

    /**
     * Constructor to initialize FooVolumeCalculator with a specific transformation.
     *
     * @param transformation the transformation to apply to the radius
     */
    public FooVolumeCalculator(Transformation transformation) {
        this.transformation = transformation;
    }

    /**
     * Calculates the volume of a sphere after applying a transformation to the radius.
     *
     * @param radius the radius of the sphere
     * @return the volume of the sphere after transformation
     * @throws IllegalArgumentException if the radius is negative, NaN, or infinite
     */
    @Override
    public double calculateVolume(double radius) {
        // Check for invalid radius values
        if (radius < 0 || Double.isNaN(radius) || Double.isInfinite(radius)) {
            throw new IllegalArgumentException("Radius cannot be negative, NaN, or infinite");
        }
        
        // Apply the transformation to the radius
        double transformedRadius = transformation.transform(radius);
        
        // Calculate and return the volume of the sphere using the transformed radius
        return (4.0 / 3.0) * Math.PI * Math.pow(transformedRadius, 3);
    }
}
