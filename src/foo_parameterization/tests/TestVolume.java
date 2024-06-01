package foo_parameterization.tests;

import foo_parameterization.core.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVolume {

    private VolumeCalculator fooCalculator;
   
   
    @BeforeEach
    public void setUp() {
        fooCalculator = CalculatorFactory.createVolumeCalculator("Foo");
    }

    @Test
    public void testFooVolumeWithPositiveRadius() {
        double radius = 10.0;
        double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius * 1.1, 3);
        assertEquals(expectedVolume, fooCalculator.calculateVolume(radius), 1e-9);
    }

    @Test
    public void testFooVolumeWithZeroRadius() {
        double radius = 0.0;
        double expectedVolume = 0.0;
        assertEquals(expectedVolume, fooCalculator.calculateVolume(radius), 1e-9);
    }

    @Test
    public void testFooVolumeWithNegativeRadius() {
        double radius = -5.0;
        assertThrows(IllegalArgumentException.class, () -> fooCalculator.calculateVolume(radius));
    }

    @Test
    public void testFooVolumeWithLargeRadius() {
        double radius = 1e6;
        double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius * 1.1, 3);
        assertEquals(expectedVolume, fooCalculator.calculateVolume(radius), 1e-9);
    }

    // Additional tests for different scenarios
    @Test
    public void testFooVolumeWithNaN() {
        double radius = Double.NaN;
        assertThrows(IllegalArgumentException.class, () -> fooCalculator.calculateVolume(radius));
    }

    @Test
    public void testFooVolumeWithInfinity() {
        double radius = Double.POSITIVE_INFINITY;
        assertThrows(IllegalArgumentException.class, () -> fooCalculator.calculateVolume(radius));
    }

    @Test
    public void testFooVolumeWithNegativeInfinity() {
        double radius = Double.NEGATIVE_INFINITY;
        assertThrows(IllegalArgumentException.class, () -> fooCalculator.calculateVolume(radius));
    }
}
