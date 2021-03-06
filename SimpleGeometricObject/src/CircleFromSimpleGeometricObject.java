
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;
	
	public CircleFromSimpleGeometricObject() {}
	
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
		/* Can invoke the super constructor directly 
		 * to create the instance with properties 
		 * that are part of the parent state.
		 * Invocation to 'super' constructor has to be the first statement in this constructor 
		 */
		// super(color, filled);
		
		// OR
		/* can set the parent state via setters, which the subclass has access via inheritance */
		setColor(color);
		setFilled(filled);
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius / Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public double getPerimeter() {
		return radius * Math.PI;
	}
	
	public String toString() {
		return "The cicle created is created " + getDateCreated() +
				" and the radius is " + radius;
	}	
	
}
