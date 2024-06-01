package foo_parameterization.core;
/*

    Implementation of the Transformation interface for the Foo parameterization. 
    
    Parameters:
    radius (float): The original radius of the sphere.
    
    Returns:
    float: The transformed radius.
      
*/
public class FooTransformation implements Transformation {
    @Override
    public double transform(double radius) {
        double correctionFactor = 0.1 * radius;
        return radius + correctionFactor;
    }
}
