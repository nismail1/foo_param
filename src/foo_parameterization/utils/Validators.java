package foo_parameterization.utils;
/* Utility class containing methods for input validation.
 */
public class Validators {
    /**
     * Validate the radius input.
     *
     * @param radius The radius of the sphere.
     * @throws IllegalArgumentException If the radius is negative.
     */
    public static void validateRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }
}
